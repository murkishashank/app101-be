package com.example.crud1.users;

import java.util.List;
import java.util.Optional;

public interface UsersService {

    List<UsersEntity> getAllUsers();

    Optional<UsersEntity> getUserById(Integer userId);

    Optional<UsersEntity> getUserByUserName(String userName);

    UsersEntity saveUsersDetails(UsersEntity userEntity);

    void delete(Integer userId);

    List<Object> getAllUsersIds();

    Boolean validateLogin(UsersEntity loginDetails);

    Integer getNewEmployeeCount();
}
