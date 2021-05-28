package com.RedditApp.Reddit.Controller;


import com.RedditApp.Reddit.Model.Post;
import com.RedditApp.Reddit.Model.User;
import com.RedditApp.Reddit.Service.PostService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;

import static java.time.LocalTime.now;

@RestController
@RequestMapping("/")
public class PostController {

    @Autowired
    public PostService postService;

    @PostMapping("/post/{userId}/create")
    public String createpost(@RequestBody String data,@PathVariable String userId) throws JsonProcessingException {
        Post post=new Post();
        post=new ObjectMapper().readValue(data,Post.class);
        post.setTIMESTAMP(LocalTime.now());
        post.setUser(new User(userId));
        Integer postid=postService.createpost(post);
        if(postid!=0)
        {
            return "Dear User your post has been created with id: "+postid;
        }
        return "Sorry the post wasn't save please try again :(";
    }

    @GetMapping("/post/all")
    public List<Post> allpsot()
    {
        return postService.allpostslist();
    }


}
