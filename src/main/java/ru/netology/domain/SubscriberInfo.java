package ru.netology.domain;

import java.security.SecureRandom;

public class SubscriberInfo {
    public String name;
    public int id;
    public String userPhoto;

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getUserPhoto(){
        return userPhoto;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setUserPhoto(String userPhoto){
        this.userPhoto = userPhoto;
    }
}