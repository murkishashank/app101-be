package com.example.crud1.feedBack;

import java.util.List;

public interface FeedBackService {

    List<FeedbackEntity> getAllFeedbackComments();

    FeedbackEntity saveFeedBackComment(FeedbackEntity feedbackEntity);

}
