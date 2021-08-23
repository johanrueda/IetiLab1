package edu.eci.apiRest.dto;

public class userDto {
    String name;
    String email;
    String lastName;
    String created;

    public userDto(String name, String email, String lastName, String created) {
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.created = created;
    }
}
