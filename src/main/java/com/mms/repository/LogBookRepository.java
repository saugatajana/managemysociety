package com.mms.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mms.model.LogBook;

@Repository
public interface LogBookRepository extends CrudRepository<LogBook, Long>{
	public List<LogBook> findByVisitorName(String visitorName);
}
