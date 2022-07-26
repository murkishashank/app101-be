package com.example.crud1.users;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<UsersEntity, Integer> {

    Optional<UsersEntity> findByUserName(String userName);

}
