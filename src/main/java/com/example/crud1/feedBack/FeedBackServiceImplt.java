package com.example.crud1.feedBack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedBackServiceImplt implements FeedBackService {

    @Autowired
    private final FeedBackRepo feebackRepo;

    public FeedBackServiceImplt(FeedBackRepo feebackRepo) {
        this.feebackRepo = feebackRepo;
    }

    @Override
    public List<FeedbackEntity> getAllFeedbackComments() {
        return feebackRepo.findAll();
    }

    @Override
    public FeedbackEntity saveFeedBackComment(FeedbackEntity feedbackEntity) {
        return feebackRepo.save(feedbackEntity);
    }

}
