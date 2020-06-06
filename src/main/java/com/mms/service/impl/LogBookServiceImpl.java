package com.mms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.enums.ResponsePayload;
import com.mms.model.LogBook;
import com.mms.model.Response;
import com.mms.repository.LogBookRepository;
import com.mms.service.LogBookService;

@Service
public class LogBookServiceImpl implements LogBookService {
	
	@Autowired
	private LogBookRepository logbookRepository;

	@Override
	public Response addLog(LogBook logBook) {
		Response response = new Response();
		LogBook newLogBack=logbookRepository.save(logBook);
		if(newLogBack!=null) {
			logbookRepository.save(logBook);
			response.setSuccess(true);
			response.setCode(ResponsePayload.LOG_CREATION_SUCCESS.getKey());
			response.setResponse(ResponsePayload.LOG_CREATION_SUCCESS.getValue());
		} else {
			response.setSuccess(false);
			response.setCode(ResponsePayload.LOG_CREATION_ISSUE.getKey());
			response.setResponse(ResponsePayload.LOG_CREATION_ISSUE.getValue());
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
