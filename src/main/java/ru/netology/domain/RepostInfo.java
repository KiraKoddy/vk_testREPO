package ru.netology.domain;

public class RepostInfo {
    private int count;
    private boolean userReposted;

    public int getCount(){
        return count;
    }
    public boolean isUserReposted(){
        return userReposted;
    }
    public void setCount(int count){
        this.count = count;
    }
    public void setUserReposted(boolean userReposted){
        this.userReposted = userReposted;
    }
}
