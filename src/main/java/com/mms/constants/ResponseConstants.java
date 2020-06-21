package com.mms.constants;

public class ResponseConstants {
	
	public interface MMSReposneCode {
		public static final String OK = "OK";
		public static final String FAILED = "FAILED";
	}
	
	public interface UsersOperationResponse {
		public static final String USER_CREATION_SUCCESS= "User has been added or updated successfully";
		public static final String USER_CREATION_USER_EXIST ="User already exist";
		public static final String USER_CREATION_FAILED = "User cannot be added at this moment";
	}
	public interface LogBookOpearationResponse {
		public static final String LOGBOOK_INVALID_INPUT = "LogBook - Invalid Input Received";
		public static final String LOG_CREATION_SUCCESS = "Log entry has been added or updated successfully";
		public static final String LOG_CREATION_FAILED = "Log  entry cannot be added at this moment";
	}
	
	public interface MaintenanceOpearationResponse {
		public static final String MAINTENANCE_CREATION_SUCCESS = "Maintenance added successfully";
		public static final String MAINTENANCE_CREATION_FAILED = "Maintenance added successfully";
		public static final String MAINTENANCE_ALREADY_EXIST = "Maintenance already exist";
	}
}
