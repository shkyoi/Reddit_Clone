package com.RedditApp.Reddit.Model;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {

    //1.	UserId				postId					commentId
//2.	userName			postTitle				comment
//3.	password			postDesc				post_id(FK)
//4.	email				TIMESTAMP				user_id(FK)
//5.	DOB				user_id(FK)				TIMESTAMP
//6.	TIMESTAMP

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer postId;

    public String postTitle;

    public String postDesc;

    public LocalTime TIMESTAMP;

    @ManyToOne
    //@Column(nullable = false)
    public User user;

    public Post() {
    }

    public Post(Integer postId) {
        this.postId = postId;
    }

    public Post( String postTitle, String postDesc, String user_id) {
        this.postTitle = postTitle;
        this.postDesc = postDesc;
        this.user=new User(user_id,"","","",new Date(""));
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public LocalTime getTIMESTAMP() {
        return TIMESTAMP;
    }

    public void setTIMESTAMP(LocalTime TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
