package com.mms.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mms.model.LogBook;
import com.mms.repository.LogBookRepository;
import com.mms.service.LogBookService;

@Service
public class LogBookServiceImpl implements LogBookService {
	
	@Autowired
	private LogBookRepository logbookRepository;

	/*@Override
	public List<LogBook> searchLog(String visitorName) {
		return logbookRepository.searchLogBook(visitorName);	
	}*/

	@Override
	public LogBook addLog(LogBook logBook) {
		//Updating modifyTs with current timestamp
		logBook.setModifyTs(new Date());
		return logbookRepository.save(logBook);
	}
	
}
