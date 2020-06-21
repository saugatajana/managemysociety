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

import com.mms.constants.UIConstants.MaintenanceUI;
import com.mms.model.Maintenance;
import com.mms.model.Response;
import com.mms.service.MaintenanceService;
import com.mms.utils.CommonUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/maintenance")
public class MaintenanceUIController {
	
	@Autowired
	private MaintenanceService maintenanceService;
	
	@GetMapping("/")
	public String showLogBookIndex(Model model){
		log.debug("Fetch last few maintenance list and redirect to main page ");
		List<Maintenance> maintenanceTopList = maintenanceService.findTopMaintenance();
		model.addAttribute("maintenanceList", maintenanceTopList);
		return MaintenanceUI.MAINTENANCE_MAIN_PAGE;
	}
	
	/*
	 * Navigate to add log entry page
	 */
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addLog(Model model) {
		Maintenance maintenance = new Maintenance();
		maintenance.setForYear(CommonUtils.getCurrentYear());
		maintenance.setForMonth(CommonUtils.getCurrentMonth());
		model.addAttribute("maintenance", maintenance);
		return MaintenanceUI.MAINTENANCE_ADD_PAGE;
	}
	
	/*
	 * Update a log in the database
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String upsertLog(@ModelAttribute("maintenance") Maintenance maintenance, Model model) {
		log.debug("Upserting for maintenance ");
		Response<String> response = maintenanceService.addMaintenanance(maintenance);
		model.addAttribute("message", response.getPayload());
		return MaintenanceUI.MAINTENANCE_ADD_PAGE;
	}
	
	/*
	 * Search a log by visitor name
	 */
	@RequestMapping(value="/find", method=RequestMethod.GET)
	public String searchMaintenance(@RequestParam String flatNo, Model model) {
		List<Maintenance> maintenanceList = maintenanceService.findMaintenanceByFlatNo(flatNo);
		model.addAttribute("maintenanceList", maintenanceList);
		return MaintenanceUI.MAINTENANCE_MAIN_PAGE;
	}
}
