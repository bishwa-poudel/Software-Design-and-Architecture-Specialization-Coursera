package com.example.sharingapp;

import java.util.Observer;

/**
 * @author Bishwa on 05/11/2020
 */
public class ContactController {
    private Contact contact;

    public ContactController(Contact contact) {
        this.contact = contact;
    }

    public String getId(){
        return contact.getId();
    }

    public void setId() {
        contact.setId();
    }

    public String getUsername() {
        return contact.getUsername();
    }

    public void setUsername(String username) {
        contact.setUsername(username);
    }

    public String getEmail() {
        return contact.getEmail();
    }

    public void setEmail(String email) {
        contact.setEmail(email);
    }

    public void addObserver(Observer observer) {
        contact.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        contact.deleteObserver(observer);
    }

}
