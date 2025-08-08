package com.thuctap.busbooking.service.auth;

import java.util.List;

import com.thuctap.busbooking.dto.request.AccountCreationRequest;
import com.thuctap.busbooking.entity.Account;

public interface AccountService {
    List<Account> getAllAccount();

    Account createAccountUser(AccountCreationRequest request);

    boolean verifyEmail(String email, String code);

    Account createAccountDriver(AccountCreationRequest request);
}
