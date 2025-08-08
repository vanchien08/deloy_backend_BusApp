package com.thuctap.busbooking.dto.request;

import java.time.LocalDateTime;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserFilterRequest {
    private String name;
    private Integer gender;
    private LocalDateTime birthday;
    private String phone;
    private String email;
    private Integer status;
    private Integer roleId;
}
