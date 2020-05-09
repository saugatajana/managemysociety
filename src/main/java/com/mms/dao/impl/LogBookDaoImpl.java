package com.mms.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mms.dao.LogBookDao;
import com.mms.model.LogBook;
/**
 * Repositoty class which interacts with the database
 * @author Saugata
 *
 */

@Repository
public class LogBookDaoImpl implements LogBookDao {
	
	public List<LogBook> searchLog() {
		return tempMethod();
	}
	
	
	public List<LogBook> tempMethod() {
		List<LogBook> logBooks = new ArrayList<>();
		LogBook log1 = new LogBook();
		log1.setId(123);
		log1.setVisitorName("Flipkart");
		log1.setSecurityName("Shivappa");
		log1.setCreateTs(new Date());
		
		logBooks.add(log1);
		return logBooks;
	}

}
