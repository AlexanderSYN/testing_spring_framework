package com.example.demo.DB;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String patronomyc;

    private String email;
    private boolean confirmed_email;

    private String password;

    public User(String name, String surname, String patronomyc, String email, boolean confirmed_email, String password) {
        this.name = name;
        this.surname = surname;
        this.patronomyc = patronomyc;
        this.email = email;
        this.confirmed_email = confirmed_email;
        this.password = password;
    }

    public User() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronomyc() {
        return patronomyc;
    }

    public void setPatronomyc(String patronomyc) {
        this.patronomyc = patronomyc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public boolean isConfirmedEmail() {
        return confirmed_email;
    }


    public void setConfirmedEmail(boolean confirmedEmail) {
        this.confirmed_email = confirmedEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
