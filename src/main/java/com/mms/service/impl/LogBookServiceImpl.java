package com.mms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.constants.ResponseConstants.MMSReposneCode;
import com.mms.constants.ResponseConstants.LogBookOpearationResponse;
import com.mms.model.LogBook;
import com.mms.model.Response;
import com.mms.repository.LogBookRepository;
import com.mms.service.LogBookService;

@Service
public class LogBookServiceImpl implements LogBookService {
	
	@Autowired
	private LogBookRepository logbookRepository;

	@Override
	public Response<String> addLog(LogBook logBook) {
		Response<String> response = Response.<String>builder()
									.code(MMSReposneCode.OK)
									.payload(LogBookOpearationResponse.LOG_CREATION_SUCCESS)
									.build();
		LogBook newLogBack=logbookRepository.save(logBook);
		if(newLogBack==null) {
			response.setCode(MMSReposneCode.FAILED);
			response.setPayload(LogBookOpearationResponse.LOG_CREATION_FAILED);
		}
		return response;
	}

	@Override
	public List<LogBook> findLog(String visitorName) {
		return logbookRepository.findByVisitorName(visitorName);
	}

	@Override
	public List<LogBook> findToplogs() {
		return logbookRepository.findToplogs();
	}
	
}
