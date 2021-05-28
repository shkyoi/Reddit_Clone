package com.RedditApp.Reddit.Model;

import javax.persistence.*;
import java.util.Date;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users")
public class User {


//1.	UserId				postId					commentId
//2.	userName			postTitle				comment
//3.	password			postDesc				post_id(FK)
//4.	email				TIMESTAMP				user_id(FK)
//5.	DOB				user_id(FK)				TIMESTAMP
//6.	TIMESTAMP

    @Id
    @Column(unique = true)
    public String UserId;

    public String userName;

    public String password;

    public String email;

    public Date DOB;

    public LocalTime TIMESTAMP;



    public User() {
    }

    public User(String userId) {
        UserId = userId;
    }

    public User(String UserId, String userName, String password, String email, Date DOB) {
        this.UserId=UserId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.DOB = DOB;
    }

    public User(String userId, String password) {
        UserId = userId;
        this.password = password;
    }
    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public java.util.Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public LocalTime getTIMESTAMP() {
        return TIMESTAMP;
    }

    public void setTIMESTAMP(LocalTime TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
    }

}
