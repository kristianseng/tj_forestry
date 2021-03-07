package com.krist.tjforestry.model;

import java.time.LocalDate;

public class Post {
    private int id;
    private String description;
    private double area;
    private int locationId;
    private LocalDate dateCreated;
    private String username;
    private boolean favorite;
    private String email;

    public Post(int name, String description, double area, int locationId, LocalDate dateCreated, String username, boolean favorite, String email) {
        this.id = name;
        this.description = description;
        this.area = area;
        this.locationId = locationId;
        this.dateCreated = dateCreated;
        this.username = username;
        this.favorite = favorite;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getEmail() {return email; }

    public void setEmail() { this.email = email; }

}
