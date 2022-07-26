package com.example.crud1.usersLeave;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersLeaveService {
    
    @Autowired
    private UsersLeaveRepo usersLeaveRepo;

    public UsersLeaveService(UsersLeaveRepo usersLeaveRepo) {
        super();
        this.usersLeaveRepo = usersLeaveRepo;
    }

    public List<UsersLeaveEntity> getAllUsers() {
        return usersLeaveRepo.findAll();
    }

    // public UsersLeaveEntity findById(userName) {
    //     return usersLeaveRepo.findByUserName();
    // }

    public List<UsersLeaveEntity> findById(String userName) {
        return usersLeaveRepo.findByUserName(userName);
    }

    public UsersLeaveEntity saveUsersDetails(UsersLeaveEntity record) {
        return usersLeaveRepo.save(record);
    }}
