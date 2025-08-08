package com.thuctap.busbooking.service.auth;

import java.time.LocalDateTime;
import java.util.List;

import com.thuctap.busbooking.dto.request.DriverCreationRequest;
import com.thuctap.busbooking.dto.request.UserCreationRequest;
import com.thuctap.busbooking.dto.request.UserRequest;
import com.thuctap.busbooking.entity.User;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(int id);

    User createUser(User user);

    User updateUser(int id, UserRequest request);

    void deleteUser(int id);

    void restoreUser(int id);

    User createUserLogin(UserCreationRequest request);

    User createDriver(DriverCreationRequest request);

    public List<User> filterUsers(
            String name,
            Integer gender,
            LocalDateTime birthday,
            String phone,
            String email,
            Integer status,
            Integer role);
}
