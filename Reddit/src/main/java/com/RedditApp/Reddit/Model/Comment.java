package com.RedditApp.Reddit.Model;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "comments")
public class Comment {

    //1.	UserId				postId					commentId
//2.	userName			postTitle				comment
//3.	password			postDesc				post_id(FK)
//4.	email				TIMESTAMP				user_id(FK)
//5.	DOB				user_id(FK)				TIMESTAMP
//6.	TIMESTAMP

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer commentId;

    public String comment;

    public LocalTime TIMESTAMP;

    @ManyToOne
   // @Column(nullable = false)
    public Post post;

    @ManyToOne
   // @Column(nullable = false)
    public User user;


    public Comment() {
    }

    public Comment(String comment) {
        super();
        this.comment = comment;
    }



    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalTime getTIMESTAMP() {
        return TIMESTAMP;
    }

    public void setTIMESTAMP(LocalTime TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
