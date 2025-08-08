package com.thuctap.busbooking.dto.request;

import java.time.LocalDateTime;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BusTripFilterRequest {
    Integer id;
    Integer busRouteId;
    LocalDateTime departureTime;
    Integer busId;
    Integer driverId;
    Integer status;
}
