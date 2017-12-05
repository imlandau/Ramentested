package com.example.maste.ramen.model;

/**
 * Created by fatimahal-zawwad on 12/3/17.
 */

public class User {
    private int id;
    private String UserName;

    private String UserPass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return UserName;
    }

    public void setName(String name) {
        this.UserName = name;
    }

    public String getPassword() {
        return UserPass;
    }

    public void setPassword(String password) {
        this.UserPass = password;
    }
}
