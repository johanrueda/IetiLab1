package edu.eci.apiRest.data;

import edu.eci.apiRest.dto.userDto;

import java.util.Date;
import java.util.UUID;

public class User {
    String id;
    String name;
    String email;
    String lastName;
    Date createdAt;

    public User(String id, String name, String email, String lastName, Date createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.createdAt = createdAt;
    }

    public User (userDto user, String id){
        this.id=id;
        this.name=user.getName();
        this.email=user.getEmail();
        this.lastName=user.getLastName();
        this.createdAt=user.getCreatedAt();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
