package com.mms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mms.model.Maintenance;

@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
	
}
