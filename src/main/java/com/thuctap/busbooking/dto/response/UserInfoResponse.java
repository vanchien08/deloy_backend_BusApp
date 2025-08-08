package com.thuctap.busbooking.dto.response;

import java.time.LocalDate;

import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserInfoResponse {
    int id;
    String name;
    String cccd;
    String avatar;
    String phone;
    int gender;
    LocalDate birthDate;
}
