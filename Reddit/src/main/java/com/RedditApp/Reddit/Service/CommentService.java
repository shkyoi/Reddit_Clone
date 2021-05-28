package com.RedditApp.Reddit.Service;


import com.RedditApp.Reddit.Model.Comment;
import com.RedditApp.Reddit.Model.Post;
import com.RedditApp.Reddit.Model.User;
import com.RedditApp.Reddit.Repo.CommentRepo;
import com.RedditApp.Reddit.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    public CommentRepo commentRepo;




        public Integer addcomment(Comment comment,Integer postid)
        {
//            String userid=postRepo.findByUserId(postid);
            comment.setPost(new Post(postid));
            try{
                Comment comment1=commentRepo.save(comment);
                return comment1.getCommentId();
            }
            catch (Exception ee)
            {
                System.out.println(ee);
                return 0;
            }

        }

}
