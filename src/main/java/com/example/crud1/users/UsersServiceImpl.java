package com.example.crud1.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private final UsersRepo usersRepo;

    public UsersServiceImpl(UsersRepo usersRepo) {
        super();
        this.usersRepo = usersRepo;
    }

    @Override
    public List<UsersEntity> getAllUsers() {
        return usersRepo.findAll();
    }

    @Override
    public UsersEntity saveUsersDetails(UsersEntity userEntity) {
        return usersRepo.save(userEntity);
    }

    @Override
    public Optional<UsersEntity> getUserByUserName(String userName) {
        return usersRepo.findByUserName(userName);
    }

    @Override
    public Optional<UsersEntity> getUserById(Integer userId) {
        return usersRepo.findById(userId);
    }

    @Override
    public void delete(Integer userId) {
        usersRepo.deleteById(userId);
    }
}
