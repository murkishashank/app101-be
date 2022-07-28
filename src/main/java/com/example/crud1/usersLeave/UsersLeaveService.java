package com.example.crud1.usersLeave;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UsersLeaveService {

    List<UsersLeaveEntity> getAllUsers();

    List<UsersLeaveEntity> findById(String userName);

    UsersLeaveEntity saveUsersDetails(UsersLeaveEntity record);
    
   }
