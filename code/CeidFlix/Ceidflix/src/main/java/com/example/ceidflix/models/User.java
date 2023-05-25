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

    public String getName(){
        return this.name;
    }

    public String getUsername(){
        return this.username;
    }

    public String getEmail(){
        return this.email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
