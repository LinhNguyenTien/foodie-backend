package com.kt.backend.service;

import com.kt.backend.dto.BillDto;
import com.kt.backend.dto.RevenueDto;

public interface BillService {

	BillDto createBill(BillDto billDto);
	
	BillDto getBill(Integer billId);
	
	void deleteBill(Integer billId);
	
	RevenueDto getRevenueOfStore();
}
