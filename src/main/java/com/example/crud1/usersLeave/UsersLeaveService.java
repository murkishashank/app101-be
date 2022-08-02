package com.example.crud1.usersLeave;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UsersLeaveService {

    List<UsersLeaveEntity> getAllUsers();

    UsersLeaveEntity saveUsersDetails(UsersLeaveEntity record);

    List<UsersLeaveEntity> findByUserId(Integer id);

}
