package com.RedditApp.Reddit.Repo;


import com.RedditApp.Reddit.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Integer> {

}
