package com.example.crud1.users;

import java.util.List;
import java.util.Optional;
import com.fasterxml.jackson.databind.ObjectMapper;


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
        UsersEntity user = usersRepo.findByUserName(users.getUserName());
        // System.out.println("........................" + user.getUserName());
        if(user != null) {
            System.out.println("............................User name already exists........................");
        return user;
        }
        else {
        return usersRepo.save(users);

        }
        // return user;

    }

    public void delete(int id) {
        usersRepo.deleteById(id);
    }

    public UsersEntity getUserByUserName(String userName) {
        return usersRepo.findByUserName(userName);
    }

}
