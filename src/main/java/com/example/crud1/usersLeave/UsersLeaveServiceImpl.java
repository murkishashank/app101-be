package com.example.crud1.usersLeave;

import java.util.List;
import java.util.Optional;

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
        return usersLeaveRepo.save(record);
    }

    @Override
    public Optional<UsersLeaveEntity> findById(Integer id) {
        return usersLeaveRepo.findById(id);
    }
    
}
