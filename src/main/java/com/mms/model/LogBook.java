package com.mms.model;

import java.util.Date;

public class LogBook {
	private long id;
	private String visitorType;
	private String visitorName;
	private String reasonForVisit;
	private String securityName;
	private Date createTs;
	private Date modifyTs;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVisitorType() {
		return visitorType;
	}
	public void setVisitorType(String visitorType) {
		this.visitorType = visitorType;
	}
	public String getVisitorName() {
		return visitorName;
	}
	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}
	public String getReasonForVisit() {
		return reasonForVisit;
	}
	public void setReasonForVisit(String reasonForVisit) {
		this.reasonForVisit = reasonForVisit;
	}
	public String getSecurityName() {
		return securityName;
	}
	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}
	public Date getCreateTs() {
		return createTs;
	}
	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}
	public Date getModifyTs() {
		return modifyTs;
	}
	public void setModifyTs(Date modifyTs) {
		this.modifyTs = modifyTs;
	}
}
