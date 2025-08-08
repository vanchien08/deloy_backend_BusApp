package com.thuctap.busbooking.dto.request;

import java.time.LocalDateTime;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TimeRangeRequest {
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
}
