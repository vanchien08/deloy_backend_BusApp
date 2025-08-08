package com.thuctap.busbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.thuctap.busbooking.entity.Account;
import com.thuctap.busbooking.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
    @Query("SELECT u FROM User u JOIN u.account a JOIN a.role r WHERE r.id = 1")
    List<User> findAllUsers();

    boolean existsByCccd(String cccd);

    boolean existsByPhone(String phone);

    User findByAccount(Account account);

    User findByPhone(String phone);
}
