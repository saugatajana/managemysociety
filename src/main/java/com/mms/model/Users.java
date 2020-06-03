package com.mms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.mms.constants.RepositoryConstants;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Saugata
 *
 */
@Entity
@Table(name = RepositoryConstants.Table.USERS)
@Data
@EqualsAndHashCode(callSuper=false)
@ToString
public class Users extends Auditable {
	@Id
	private String username;
	private String password;
	private String type;
	private boolean active;
}
