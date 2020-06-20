package com.mms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mms.constants.CommonConstants;
import com.mms.constants.RepositoryConstants;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = RepositoryConstants.Table.LOG_BOOK)
@Data
@EqualsAndHashCode(callSuper=false)
public class LogBook extends Auditable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;	
	private String visitorType;
	private String visitorName;
	private String reasonForVisit;
	private String securityName;
	private String flatNo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = CommonConstants.DATE_FORMAT)
	private Date entryTs = new Date();
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = CommonConstants.DATE_FORMAT)
	private Date exitTs = new Date();
}
