package com.example.crud1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private final UsersRepo usersRepo;

    public UsersService(UsersRepo usersRepo) {
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

}
