package com.example.crud1.usersLeave;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UsersLeaveService {

    List<UsersLeaveEntity> getAllUsers();

    UsersLeaveEntity saveUsersDetails(UsersLeaveEntity record);

    Optional<UsersLeaveEntity> findById(Integer id);
    
   }
