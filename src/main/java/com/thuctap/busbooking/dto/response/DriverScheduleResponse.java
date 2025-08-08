package com.thuctap.busbooking.dto.response;

import java.time.LocalDateTime;

import com.thuctap.busbooking.entity.BusType;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DriverScheduleResponse {
    Integer tripId;
    String routeName;
    String departureStationAddress;
    String arrivalStationAddress;
    String licensePlate;
    LocalDateTime departureTime;
    float estimatedHours;
    private BusType busType;
}
