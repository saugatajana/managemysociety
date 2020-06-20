package com.mms.model;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mms.constants.RepositoryConstants;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = RepositoryConstants.Table.MAINTENANCE)
@Data
@EqualsAndHashCode(callSuper=false)
public class Maintenance  extends Auditable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String flatNo;
	private String type;
	private BigDecimal amount;
	private int forMonth;
	private int forYear;
	private String paidBy;
	private String receivedBy;
	private boolean isApproved;
	private String approvedBy;
	
}