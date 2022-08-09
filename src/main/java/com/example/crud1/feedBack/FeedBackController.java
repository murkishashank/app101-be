package com.example.crud1.feedBack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class FeedBackController {

    @Autowired
    private FeedBackService feedBackService;

    public FeedBackController(FeedBackService feedBackService) {
        this.feedBackService = feedBackService;
    }

    @CrossOrigin
    @GetMapping("/allComments")
    public List<FeedbackEntity> getAllComments() {
        return feedBackService.getAllFeedbackComments();
    }

    @CrossOrigin
    @PostMapping("/saveComment")
    public FeedbackEntity saveComment(@RequestBody FeedbackEntity feedbackEntity) {
        return feedBackService.saveFeedBackComment(feedbackEntity);
    }

}
