package edu.eci.apiRest.data;

public class User {
    String id;
    String name;
    String email;
    String lastName;
    String created;

    public User(String id, String name, String email, String lastName, String created) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.created = created;
    }
}
