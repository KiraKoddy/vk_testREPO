package ru.netology.domain;

public class PlaceInfo {
    private int id;
    private String title;
    private int country;
    private int city;
    private String address;

    public int getId() {
        return id;
    }
    public String getTitle(){
        return title;
    }
    public int getCountry(){
        return country;
    }
    public int getCity(){
        return city;
    }
    public String getAddress(){
        return address;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setCountry(int country){
        this.country = country;
    }
    public void setCity(int city){
        this.city = city;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}