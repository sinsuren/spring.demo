package com.example.spring.demo.domain;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Speaker implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String twitter;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTwitter() {
        return twitter;
    }
}
