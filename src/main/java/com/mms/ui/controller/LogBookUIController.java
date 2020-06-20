package com.mms.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static com.mms.constants.UIConstants.LogBookUI;

import com.mms.model.LogBook;
import com.mms.model.Response;
import com.mms.service.LogBookService;

import lombok.extern.slf4j.Slf4j;


/**
 * Add an entry to the LogBook
 * Update an entry to the logbook
 * Search all entry based on time range/visitorType/VisitorName
 * @author Saugata
 */

@Slf4j
@Controller
@RequestMapping("/logbook")
public class LogBookUIController {
	
	@Autowired
	private LogBookService logbookService;
	
	@GetMapping("/")
	public String showLogBookIndex(Model model){
		List<LogBook> logBooks = logbookService.findToplogs();
		model.addAttribute("lastXLogsList", logBooks);
		return LogBookUI.LOGBOOK_MAIN_PAGE;
	}
	
	/*
	 * Navigate to add log entry page
	 */
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addLog(Model model) {
		model.addAttribute("logbook", new LogBook());
		return LogBookUI.LOGBOOK_ADD_PAGE;
	}
	
	/*
	 * Update a log in the database
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String upsertLog(@ModelAttribute("logbook") LogBook logBook, Model model) {
		log.debug("Upserting for logbook ");
		Response<String> response = logbookService.addLog(logBook);
		model.addAttribute("message", response.getPayload());
		return LogBookUI.LOGBOOK_ADD_PAGE;
	}
	
	/*
	 * Search a log by visitor name
	 */
	@RequestMapping(value="/find", method=RequestMethod.GET)
	public String searchLog(@RequestParam String visitor, Model model) {
		List<LogBook> logBooks = logbookService.findLog(visitor);
		model.addAttribute("logBooksList", logBooks);
		return "logbook";
	}
	
}
