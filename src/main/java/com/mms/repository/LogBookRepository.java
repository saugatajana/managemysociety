package com.mms.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mms.model.LogBook;

@Repository
public interface LogBookRepository extends CrudRepository<LogBook, Long>{
	
}
