package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int postId;

    public int getId() {
        return id;
    }
    public int getOwnerId(){
        return ownerId;
    }
    public int getPostId(){
        return postId;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setOwnerId(int ownerId){
        this.ownerId = ownerId;
    }
    public void setPostId(int postId){
        this.postId = postId;
    }
}
