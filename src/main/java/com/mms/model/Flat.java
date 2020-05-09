package com.mms.model;

import java.math.BigDecimal;
import java.util.Date;

public class Flat {
	private int id;
	private int flatNo;
	private BigDecimal maintenceAmount;
	private Date createTs;
	private Date modifyTs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public BigDecimal getMaintenceAmount() {
		return maintenceAmount;
	}
	public void setMaintenceAmount(BigDecimal maintenceAmount) {
		this.maintenceAmount = maintenceAmount;
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
