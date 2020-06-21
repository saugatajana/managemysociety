package com.mms.service;

import java.util.List;

import com.mms.model.Maintenance;
import com.mms.model.Response;

public interface MaintenanceService {
	public Response<String> addMaintenanance(Maintenance maintenance);
	public List<Maintenance> findTopMaintenance();
	public List<Maintenance> findMaintenanceByFlatNo(String flatNo);
}
