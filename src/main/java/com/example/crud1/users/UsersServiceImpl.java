package com.example.crud1.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private final UsersRepo usersRepo;

    public UsersServiceImpl(UsersRepo usersRepo) {
        super();
        this.usersRepo = usersRepo;
    }

    public List<UsersEntity> getAllUsers() {
        return usersRepo.findAll();
    }

    public Optional<UsersEntity> getUserById(int id) {
        return usersRepo.findById(id);
    }

    public UsersEntity saveUsersDetails(UsersEntity users) {
        return usersRepo.save(users);
    }

    public void delete(int id) {
        usersRepo.deleteById(id);
    }

    public Optional<UsersEntity> getUserByUserName(String userName) {
        return usersRepo.findByUserName(userName);
    }

    @Override
    public Optional<UsersEntity> getUserById(Integer userId) {
        return usersRepo.findById(userId);
    }
}
