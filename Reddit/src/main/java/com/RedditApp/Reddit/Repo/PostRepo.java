package com.RedditApp.Reddit.Repo;

import com.RedditApp.Reddit.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post,Integer> {

//    @Query("select j.UserId from Post p join fetch p.user j where j.UserId=:keyword")
//    public  String findByUserId(Integer keyword);

}
