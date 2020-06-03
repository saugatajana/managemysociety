package com.mms.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.enums.ResponsePayload;
import com.mms.model.Response;
import com.mms.model.Users;
import com.mms.repository.UsersRepository;
import com.mms.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository usersRepository;

	@Override
	public Response addUser(Users user) {
		Users existingUser = usersRepository.findUsersByUsername(user.getUsername());
		Response response = new Response();
		if(existingUser==null) {
			Users newUser = usersRepository.save(user);
			if(newUser!=null) {
				response.setSuccess(true);
				response.setCode(ResponsePayload.USER_CREATION_SUCCESS.getKey());
				response.setResponse(ResponsePayload.USER_CREATION_SUCCESS.getValue());
			} else {
				response.setSuccess(false);
				response.setCode(ResponsePayload.USER_CREATION_ISSUE.getKey());
				response.setResponse(ResponsePayload.USER_CREATION_ISSUE.getValue());
			}
		} else {
			response.setSuccess(false);
			response.setCode(ResponsePayload.USER_CREATION_USER_EXIST.getKey());
			response.setResponse(ResponsePayload.USER_CREATION_USER_EXIST.getValue());
		}
		return response;
	}

	
	
}
