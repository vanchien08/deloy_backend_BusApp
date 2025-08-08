package com.thuctap.busbooking.service.auth;

import java.time.LocalDateTime;
import java.util.List;

import com.thuctap.busbooking.dto.response.DriverScheduleResponse;
import com.thuctap.busbooking.entity.User;

public interface DriverService {
    List<User> getAllDrivers();

    public List<User> filterDrivers(
            String name,
            Integer gender,
            LocalDateTime birthday,
            String phone,
            String email,
            Integer status,
            Integer role);

    List<DriverScheduleResponse> getScheduleByDriverAndDateRange(
            Integer driverId, LocalDateTime startDate, LocalDateTime endDate);
}
