package com.thuctap.busbooking.dto.request;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private String name;
    private String phone;
    private Integer gender;
    private LocalDate birthDate;
}
