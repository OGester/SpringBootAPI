package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private String id;

    private String userName;

    private String userAdress;

    private String userPhoneNr;

    public User() {
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public String getUserPhoneNr() {
        return userPhoneNr;
    }
}
