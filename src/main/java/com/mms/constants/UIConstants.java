package com.mms.constants;

public class UIConstants {
	
	public interface LogBookUI {
		public static final String LOGBOOK_TEMPLATE_FOLDER = "/logbook/";
		
		//These are html file name
		public static final String LOGBOOK_MAIN_PAGE = LOGBOOK_TEMPLATE_FOLDER + "logbook";
		public static final String LOGBOOK_ADD_PAGE = LOGBOOK_TEMPLATE_FOLDER + "addEntry";
		public static final String LOGBOOK_UPDATE_PAGE = LOGBOOK_TEMPLATE_FOLDER + "upddateEntry";
	}
	
	public interface MaintenanceUI {
		public static final String MAINTENANCE_TEMPLATE_FOLDER = "/maintenance/";
		public static final String MAINTENANCE_MAIN_PAGE = MAINTENANCE_TEMPLATE_FOLDER + "maintenance";
		public static final String MAINTENANCE_ADD_PAGE = MAINTENANCE_TEMPLATE_FOLDER + "addEntry";
		public static final String MAINTENANCE_UPDATE_PAGE = MAINTENANCE_TEMPLATE_FOLDER + "upddateEntry";
		
	}
	
}
