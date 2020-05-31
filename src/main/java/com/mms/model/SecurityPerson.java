package com.mms.model;

import java.util.Date;

import lombok.Data;

@Data
public class SecurityPerson {
	private int id;
	private String name;
	private String companyName;
	private Date fromDate;
	private Date toDate;
	private boolean isActive;
	private Date createTs;
	private Date modifyTs;
	
}
