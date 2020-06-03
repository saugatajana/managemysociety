package com.mms.enums;

public enum ResponsePayload {
	//Users
	USER_CREATION_SUCCESS("UC100", "User has been added or updated successfully"),
	USER_CREATION_USER_EXIST("UC101", "User already exist"),
	USER_CREATION_ISSUE("UCEX102", "User cannot be created at this moment"),
	
	//LOG
	LOG_CREATION_SUCCESS("LG101", "Log has been added or updated successfully"),
	LOG_CREATION_ISSUE("LGEX103", "Log cannot be added at this moment");
	
	private final String key;
    private final String value;
    ResponsePayload(String key, String value) {
    	this.key = key;
        this.value = value;
	}
    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
}
