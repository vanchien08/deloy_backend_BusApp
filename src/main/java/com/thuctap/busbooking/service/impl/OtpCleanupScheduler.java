package com.thuctap.busbooking.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.thuctap.busbooking.repository.OtpRepository;

@Component
public class OtpCleanupScheduler {

    @Autowired
    private OtpRepository otpRepository;

    @Scheduled(fixedRate = 60000)
    public void cleanExpiredOtp() {
        otpRepository.deleteExpiredOtp(LocalDateTime.now());
    }
}
