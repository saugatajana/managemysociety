package com.mms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.dao.LogBookDao;
import com.mms.model.LogBook;
import com.mms.service.LogBookService;

@Service
public class LogBookServiceImpl implements LogBookService{
	
	@Autowired
	private LogBookDao logbookDao;
	
	public List<LogBook> searchLog() {
		return logbookDao.searchLog();
	}
}
