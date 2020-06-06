package com.mms.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mms.constants.QueryConstants;
import com.mms.model.LogBook;

@Repository
public interface LogBookRepository extends CrudRepository<LogBook, Long>{
	public List<LogBook> findByVisitorName(String visitorName);
	
	@Query(nativeQuery = true, value=QueryConstants.LogBookSQL.LAST_X_RECORDS_QUERY)
	public List<LogBook> findToplogs();
}
