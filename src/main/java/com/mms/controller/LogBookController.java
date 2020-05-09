package com.mms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mms.model.LogBook;
import com.mms.service.LogBookService;

/**
 * Add an entry to the LogBook
 * Update an entry to the logbook
 * Search all entry based on time range/visitorType/VisitorName
 * @author Saugata
 */
@RestController
@RequestMapping("/logbook")
public class LogBookController {
	
	@Autowired
	private LogBookService logbookService;
	
	public void addLog() {
		
	}
	
	public void updateLog() {
		
	}
	
	@GetMapping("/search")
	public List<LogBook> searchLog() {
		return logbookService.searchLog();
		
	}
}
