package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean userLikes;
    private boolean canLike;
    private boolean canPublish;

    public int getCount(){
        return count;
    }
    public boolean isUserLikes(){
        return userLikes;
    }
    public boolean isCanLike(){
        return canLike;
    }
    public boolean isCanPublish(){
        return canPublish;
    }
    public void setCount(int count){
        this.count = count;
    }
    public void setUserLikes(boolean userLikes){
        this.userLikes = userLikes;
    }
    public void setCanLike(boolean canLike){
        this.canLike = canLike;
    }
    public void setCanPublish(boolean canPublish){
        this.canPublish = canPublish;
    }
}