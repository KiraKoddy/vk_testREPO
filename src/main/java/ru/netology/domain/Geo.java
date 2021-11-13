package ru.netology.domain;

public class Geo {
    private String type;
    private String coordinates;
    private int place;

    public String getType() {
        return type;
    }
    public String getCoordinates(){
        return coordinates;
    }
    public int getPlace(){
        return place;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setCoordinates(String coordinates){
        this.coordinates = coordinates;
    }
    public void setPlace(int place){
        this.place = place;
    }
}
