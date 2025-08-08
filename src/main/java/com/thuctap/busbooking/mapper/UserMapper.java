package com.thuctap.busbooking.mapper;

import org.mapstruct.Mapper;

import com.thuctap.busbooking.dto.request.DriverCreationRequest;
import com.thuctap.busbooking.dto.request.UserCreationRequest;
import com.thuctap.busbooking.dto.request.UserUpdateInfoRequest;
import com.thuctap.busbooking.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUserCreation(UserCreationRequest request);

    User toDriverCreation(DriverCreationRequest request);

    User toUserUpdateInfo(UserUpdateInfoRequest request);
}
