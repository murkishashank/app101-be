package com.example.crud1.usersLeave;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersLeaveRepo extends JpaRepository<UsersLeaveEntity, Integer>{

    List<UsersLeaveEntity> findByUserId(Integer userId);
}
