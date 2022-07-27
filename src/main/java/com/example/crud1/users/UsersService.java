package com.example.crud1.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface UsersService {

    List<UsersEntity> getAllUsers();

    Optional<UsersEntity> getUserById(Integer userId);

    UsersEntity getUserByUserName(String userName);

    UsersEntity saveUsersDetails(UsersEntity record);

    void delete(int employeeId);

   

}
