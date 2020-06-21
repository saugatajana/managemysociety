package com.mms.service.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.constants.ResponseConstants.MMSReposneCode;
import com.mms.constants.ResponseConstants.MaintenanceOpearationResponse;
import com.mms.model.Maintenance;
import com.mms.model.Response;
import com.mms.repository.MaintenanceRepository;
import com.mms.service.MaintenanceService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MaintenanceServiceImpl implements MaintenanceService {

	@Autowired
	private MaintenanceRepository maintenanceRepository;
	
	@Override
	public Response<String> addMaintenanance(Maintenance maintenance) {
		Response<String> response = Response.<String>builder()
				.code(MMSReposneCode.OK)
				.payload(MaintenanceOpearationResponse.MAINTENANCE_CREATION_SUCCESS)
				.build();
		List<Maintenance> existingMaintenanceList = maintenanceRepository.findByFlatNoAndTypeAndForMonthAndForYear(maintenance.getFlatNo(), maintenance.getType(), maintenance.getForMonth(), maintenance.getForYear());
		if(CollectionUtils.isEmpty(existingMaintenanceList)) {
			Maintenance newMaintenance = maintenanceRepository.save(maintenance);
			if(newMaintenance==null) {
				response.setCode(MMSReposneCode.FAILED);
				response.setPayload(MaintenanceOpearationResponse.MAINTENANCE_CREATION_FAILED);
			}
		} else {
			log.info("Maintenance already exist for {} for {}-{}",maintenance.getFlatNo(), maintenance.getForMonth(),maintenance.getForYear());
			response.setCode(MMSReposneCode.FAILED);
			response.setPayload(MaintenanceOpearationResponse.MAINTENANCE_ALREADY_EXIST);
		}
		
		return response;
	}

	@Override
	public List<Maintenance> findTopMaintenance() {
		log.debug("Searching last 10 maintenace");
		return maintenanceRepository.findTopMaintenance();
	}

	@Override
	public List<Maintenance> findMaintenanceByFlatNo(String flatNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
