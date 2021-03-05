package com.krist.tjforestry.model;

import java.time.LocalDate;

public class Post {
    private int id;
    private String description;
    private int area;
    private String city;
    private LocalDate dateCreated;
    private String username;
    private boolean favorite;

    public Post(int name, String description, int area, String city, LocalDate dateCreated, String username, boolean favorite) {
        this.id = name;
        this.description = description;
        this.area = area;
        this.city = city;
        this.dateCreated = dateCreated;
        this.username = username;
        this.favorite = favorite;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

}
