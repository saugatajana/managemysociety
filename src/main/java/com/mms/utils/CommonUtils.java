package com.mms.utils;

import java.time.LocalDate;

public class CommonUtils {
	public static int getCurrentYear() {
		LocalDate localDate = LocalDate.now();
		return localDate.getYear();
	}
	
	public static String getCurrentMonth() {
		LocalDate localDate = LocalDate.now();
		return localDate.getMonth().name();
	}
}
