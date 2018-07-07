package com.example.android.saratogaspringstour;

public class Location {

    private String name;
    private String address;
    private String details;
    private int locationImage;

    //multiple constructors
    public Location (String name, String address){
        this.name = name;
        this.address = address;
    }

    public Location (String name, String address, String details){
        this.name = name;
        this.address = address;
        this.details = details;
    }

    public Location (String name, String address, String details, int locationImage){
        this.name = name;
        this.address = address;
        this.details = details;
        this.locationImage = locationImage;
    }

    //getter methods
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDetails() {
        return details;
    }

    public int getLocationImage() {
        return locationImage;
    }
}
