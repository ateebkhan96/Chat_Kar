package com.example.chat_kar.Model;

public class User{
    private String id;
    private String username;
    private String imageurl;
    private String search;
    private String status;

    public User(String id, String username, String imageurl, String search, String status) {
        this.id = id;
        this.username = username;
        this.imageurl = imageurl;
        this.search = search;
        this.status = status;
    }

    public User() {
    }

    public static Object getImageURL() {

        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
