package com.RedditApp.Reddit.Service;


import com.RedditApp.Reddit.Model.Post;
import com.RedditApp.Reddit.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
        @Autowired
    public PostRepo postRepo;

        public Integer createpost(Post post)
        {
            try{
                Post post1=postRepo.save(post);

                return post1.getPostId();
            }
            catch (Exception e)
            {
                System.out.println(e);
                return  0;
            }
        }

        public List<Post> allpostslist()
        {
            return postRepo.findAll();
        }


}
