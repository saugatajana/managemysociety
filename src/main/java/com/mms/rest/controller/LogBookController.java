package com.mms.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	/**
	 * Add an log entry in the database
	 */
	@RequestMapping(value="/add",method=RequestMethod.PUT)
	public LogBook addLog(@RequestBody LogBook logBook) {
		return logbookService.addLog(logBook);
	}
	
	public void updateLog() {
		
	}
	
	/*@RequestMapping(value="/search", method=RequestMethod.GET)
	public List<LogBook> searchLog() {
		return logbookService.searchLog("Something");
		
	}*/
	
}
