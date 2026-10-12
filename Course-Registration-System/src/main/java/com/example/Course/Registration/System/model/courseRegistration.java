package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class courseRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String courseName;

    public courseRegistration() {

    }

    public courseRegistration(String name, String email, String courseName) {
        this.name = name;
        this.email = email;
        this.courseName = courseName;
    }
}