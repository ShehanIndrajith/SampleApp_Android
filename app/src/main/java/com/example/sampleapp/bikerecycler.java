package com.example.sampleapp;

public class bikerecycler {
    String name;
    int year;
    int image;

    public bikerecycler(String name, int year, int image) {
        this.name = name;
        this.year = year;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
