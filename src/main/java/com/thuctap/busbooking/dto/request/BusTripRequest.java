package com.thuctap.busbooking.dto.request;

import java.time.LocalDateTime;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BusTripRequest {
    Integer busRouteId;
    LocalDateTime departureTime;
    Float costOperating;
    Float costIncurred;
    Integer price;
    Integer busId;
    Integer driverId;
    Integer status;
}
