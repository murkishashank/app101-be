package com.example.crud1;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<UsersEntity, Integer> {

    UsersEntity findByUserName(String userName);

}
