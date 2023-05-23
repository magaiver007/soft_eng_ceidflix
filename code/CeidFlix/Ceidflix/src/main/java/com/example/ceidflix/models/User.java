package com.example.ceidflix.models;

public class User {
    private String name;
    private String username;
    private String email;

    public User(){
        this.name = "";
        this.username = "";
        this.email = "";
    }

    public User(String name, String username, String email){
        this.name = name;
        this.username = username;
        this.email = email;
    }
}
