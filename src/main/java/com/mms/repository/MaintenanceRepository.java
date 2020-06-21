package com.mms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mms.constants.QueryConstants;
import com.mms.model.Maintenance;

@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
	
	@Query(nativeQuery = true, value=QueryConstants.MaintenanceSQL.LAST_X_RECORDS_QUERY)
	public List<Maintenance> findTopMaintenance();
	
	public List<Maintenance> findByFlatNoAndTypeAndForMonthAndForYear(String flatNo, String type, String month, int year);
}
