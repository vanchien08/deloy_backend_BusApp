package com.thuctap.busbooking.mapper;

import org.mapstruct.Mapper;

import com.thuctap.busbooking.dto.request.RoleRequest;
import com.thuctap.busbooking.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    Role toRole(RoleRequest request);
}
