package com.kpmg.Omnichannel.dto;

import com.kpmg.Omnichannel.util.RequestType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VPARequestDTO {
	
	private String accountNumber;
	
	private RequestType type;
	
	private String userId;            //considering mobile no.
	
	

}
