package com.mms.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
@Data
public class Flat {
	private int id;
	private int flatNo;
	private BigDecimal maintenceAmount;
	private Date createTs;
	private Date modifyTs;
}
