package com.kpmg.Omnichannel.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpmg.Omnichannel.dto.VPARequestDTO;
import com.kpmg.Omnichannel.model.VPA;
import com.kpmg.Omnichannel.repository.VPARepository;
import com.kpmg.Omnichannel.util.RequestType;

@Service
public class VPAServiceImpl implements VPAService{
	
	@Autowired
	private VPARepository vpaRepo;
	
	

	@Override
	public VPA processVPARequest(VPARequestDTO request) {
		
		VPA vpa = new VPA();
		
		//generating VPA using userId(Mobile Number) 
		
		String generateVpaId = request.getUserId() + "@bank";
		
		//Map DTO to Entity
		
		vpa.setVpaId(generateVpaId);
		vpa.setAccountNumber(request.getAccountNumber());
		vpa.setUserId(request.getUserId());
		
		if(request.getType() == RequestType.CREATE)
		{
			vpa.setActive(true);
		}
		else if(request.getType() == RequestType.DELETE)
		{
			vpa.setActive(false);
		}
		
		//Mapping Audit Fields
		vpa.setCreatedBy(request.getUserId());
		vpa.setCreatedAt(LocalDateTime.now());
		vpa.setModifiedBy(request.getUserId());
		vpa.setModifiedAt(LocalDateTime.now());
		
		return vpaRepo.save(vpa);
	}

}
