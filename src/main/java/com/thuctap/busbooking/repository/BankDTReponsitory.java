package com.thuctap.busbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuctap.busbooking.entity.BankDetails;

public interface BankDTReponsitory extends JpaRepository<BankDetails, Integer> {}
