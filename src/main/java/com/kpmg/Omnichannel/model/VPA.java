package com.kpmg.Omnichannel.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vpa")
public class VPA {
	
	@Id
	private String vpaId;
	
	@Column(nullable = false)
	private String userId;
	
	@Column(nullable = false)
	private String accountNumber;
	
	@Column(nullable = false)
	private boolean isActive;
	
	
	//Audit related fields
	private String createdBy;
	
	private LocalDateTime createdAt;
	
	private String modifiedBy;
	
	private LocalDateTime modifiedAt;
	
	
	
	
//	//Relationships
//	@OneToMany(mappedBy = "payerVpa", cascade = CascadeType.ALL)
//	private List<UpiTransfer> transfer;
//	
//	@OneToMany(mappedBy = "receiveFundsInVpa", cascade = CascadeType.ALL)
//	private List<UpiRequestMoney> request;
//	
//	@OneToMany(mappedBy = "initiatorVpa", cascade = CascadeType.ALL)
//	private List<UpiSplitBill> splitBills;
//	
	

}
