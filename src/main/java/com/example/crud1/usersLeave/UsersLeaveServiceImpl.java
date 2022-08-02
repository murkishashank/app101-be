package com.example.crud1.usersLeave;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersLeaveServiceImpl implements UsersLeaveService {
    @Autowired
    private UsersLeaveRepo usersLeaveRepo;

    public UsersLeaveServiceImpl(UsersLeaveRepo usersLeaveRepo) {
        super();
        this.usersLeaveRepo = usersLeaveRepo;
    }

    public List<UsersLeaveEntity> getAllUsers() {
        return usersLeaveRepo.findAll();
    }

    public UsersLeaveEntity saveUsersDetails(UsersLeaveEntity record) {
        long millis=System.currentTimeMillis(); 
        record.setApprovedDate(new Date(millis));
        return usersLeaveRepo.save(record);
    }

    @Override
    public List<UsersLeaveEntity> findByUserId(Integer id) {
        return usersLeaveRepo.findByUserId(id);
    }
    
}
