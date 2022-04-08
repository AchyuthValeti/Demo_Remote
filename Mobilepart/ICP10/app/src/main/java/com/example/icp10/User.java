package com.example.icp10;

import com.google.gson.annotations.SerializedName;

public class User {

    private int id;

    @SerializedName("login")
    private String username;
    
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;

    }
}
