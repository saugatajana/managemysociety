package com.mms.constants;

public class QueryConstants {
	
	public static final int LOG_BOOK_LAST_X_RECORDS = 20;
	
	public interface LogBookSQL {
		public static final String LAST_X_RECORDS_QUERY = "select * from LogBook ORDER BY last_modified_date LIMIT "+LOG_BOOK_LAST_X_RECORDS;
	}
}