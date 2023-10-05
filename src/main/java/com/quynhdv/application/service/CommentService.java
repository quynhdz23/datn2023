package com.quynhdv.application.service;

import com.quynhdv.application.entity.Comment;
import com.quynhdv.application.model.request.CreateCommentPostRequest;
import com.quynhdv.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest, long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
