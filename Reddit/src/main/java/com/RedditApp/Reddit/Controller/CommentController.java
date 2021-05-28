package com.RedditApp.Reddit.Controller;


import com.RedditApp.Reddit.Model.Comment;
import com.RedditApp.Reddit.Model.Post;
import com.RedditApp.Reddit.Model.User;
import com.RedditApp.Reddit.Service.CommentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;

@RestController
@RequestMapping("/")
public class CommentController {

    @Autowired
    public CommentService commentService;
    
    @PostMapping("{Userid}/post/{postId}/comment/create")
    public String createcomment(@PathVariable Integer postId,@PathVariable String Userid, @RequestBody String data) throws JsonProcessingException {
        Comment comment=new Comment();
        comment=new ObjectMapper().readValue(data,Comment.class);
        comment.setTIMESTAMP(LocalTime.now());
        comment.setUser(new User(Userid));
        Integer commentId=commentService.addcomment(comment,postId);
        if(commentId!=0)
        {
            return "Dear User your post has been created with id: "+commentId;
        }
        return "Sorry the post wasn't save please try again :(";

    }
}
