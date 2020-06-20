package com.mms.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.constants.ResponseConstants.MMSReposneCode;
import com.mms.constants.ResponseConstants.UsersOperationResponse;
import com.mms.model.Response;
import com.mms.model.Users;
import com.mms.repository.UsersRepository;
import com.mms.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository usersRepository;

	@Override
	public Response<String> addUser(Users user) {
		Users existingUser = usersRepository.findUsersByUsername(user.getUsername());
		Response<String> response = Response.<String>builder()
										.code(MMSReposneCode.OK)
										.payload(UsersOperationResponse.USER_CREATION_SUCCESS)
										.build();
		if(existingUser==null) {
			Users newUser = usersRepository.save(user);
			if(newUser==null) {
				response.setCode(MMSReposneCode.FAILED);
				response.setPayload(UsersOperationResponse.USER_CREATION_FAILED);
			}
		} else {
			response.setCode(MMSReposneCode.FAILED);
			response.setPayload(UsersOperationResponse.USER_CREATION_USER_EXIST);
		}
		return response;
	}

	
	
}
