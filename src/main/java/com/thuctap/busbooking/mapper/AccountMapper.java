package com.thuctap.busbooking.mapper;

import org.mapstruct.Mapper;

import com.thuctap.busbooking.dto.request.AccountCreationRequest;
import com.thuctap.busbooking.entity.Account;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    Account toAccount(AccountCreationRequest request);
}
