package com.example.sharingapp;

import java.util.UUID;

/**
 * Created by bishwa on 10/08/2020.
 */

public class Contact {
    private String username;
    private String email;
    private String id;

    public Contact(String name, String email, String id) {
        this.username = name;
        this.email = email;

        if(id == null) {
            setId();
        }
        else {
            updateId(id);
        }
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }

    public void updateId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
}