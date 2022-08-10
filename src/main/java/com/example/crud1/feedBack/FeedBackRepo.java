package com.example.crud1.feedBack;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FeedBackRepo extends JpaRepository<FeedbackEntity, Integer> {

}
