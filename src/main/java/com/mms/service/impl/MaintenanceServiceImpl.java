package com.mms.service.impl;

import com.mms.constants.ResponseConstants.MMSReposneCode;
import com.mms.constants.ResponseConstants.MaintenanceOpearationResponse;
import com.mms.model.Maintenance;
import com.mms.model.Response;
import com.mms.repository.MaintenanceRepository;
import com.mms.service.MaintenanceService;

public class MaintenanceServiceImpl implements MaintenanceService {

	private MaintenanceRepository maintenanceRepository;
	
	@Override
	public Response<String> addLog(Maintenance maintenance) {
		Response<String> response = Response.<String>builder()
				.code(MMSReposneCode.OK)
				.payload(MaintenanceOpearationResponse.MAINTENANCE_CREATION_SUCCESS)
				.build();
		Maintenance newMaintenance = maintenanceRepository.save(maintenance);
		if(newMaintenance==null) {
			response.setCode(MMSReposneCode.FAILED);
			response.setPayload(MaintenanceOpearationResponse.MAINTENANCE_CREATION_FAILED);
		}
		return response;
	}

}
