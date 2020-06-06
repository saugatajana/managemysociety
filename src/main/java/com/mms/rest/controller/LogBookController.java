package com.mms.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mms.model.LogBook;
import com.mms.model.Response;
import com.mms.service.LogBookService;

/**
 * Add an entry to the LogBook
 * Update an entry to the logbook
 * Search all entry based on time range/visitorType/VisitorName
 * @author Saugata
 */
@RestController
@RequestMapping("/api/logbook")
public class LogBookController {
	
	@Autowired
	private LogBookService logbookService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<LogBook> findLastLogs() {
		return logbookService.findToplogs();
	}
	/*
	 * Add a log entry in the database
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Response addLog(@RequestBody LogBook logBook) {
		return logbookService.addLog(logBook);
	}
	
	/*
	 * Update a log in the database
	 */
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public Response updateLog(@RequestBody LogBook logBook) {
		return logbookService.addLog(logBook);
	}
	
	/*
	 * Search a log by visitor name
	 */
	@RequestMapping(value="/find", method=RequestMethod.GET)
	public List<LogBook> searchLog(@RequestParam String visitor) {
		return logbookService.findLog(visitor);
	}
	
}
