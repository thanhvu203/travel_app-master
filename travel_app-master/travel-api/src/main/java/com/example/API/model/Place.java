package com.example.travelapi.model;

public class Place {
    private String name;
    private double rating;
    private String imageUrl;

    // Constructors
    public Place(String name, double rating, String imageUrl) {
        this.name = name;
        this.rating = rating;
        this.imageUrl = imageUrl;
    }

    // Getters và Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
