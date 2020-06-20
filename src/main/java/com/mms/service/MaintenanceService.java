package com.mms.service;

import com.mms.model.Maintenance;
import com.mms.model.Response;

public interface MaintenanceService {
	public Response<String> addLog(Maintenance maintenance);
}
