package com.kt.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.kt.backend.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer>{

	@Query(value = "select sum(totalprice) from bill", nativeQuery = true)
	Double getRevenue();
}
