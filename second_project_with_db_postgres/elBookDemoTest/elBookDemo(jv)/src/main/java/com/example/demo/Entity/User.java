package com.example.demo.Entity;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@Entity
@Table(name = "Users")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "patronomyc")
    private String patronomyc;

    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;
    @Column(name = "confirmed_email")
    private boolean confirmed_email;

    @Column(name = "role")
    private String role;
    @Column(name = "course")
    private int course;
    @Column(name = "groups")
    private int groups;

    public User(String username, String name, String surname, String patronomyc,
                String login, String password, String email, boolean confirmed_email,
                String role, int course, int groups) {
        this.username = username;

        this.name = name;
        this.surname = surname;
        this.patronomyc = patronomyc;

        this.login = login;
        this.password = password;

        this.email = email;
        this.confirmed_email = confirmed_email;

        this.role = role;
        this.course = course;
        this.groups = groups;
    }

    public User() {

    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
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

    public String getLogin() {return login;}
    public void setLogin(String login) {this.login = login;}

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public int getGroups() {
        return groups;
    }
    public void setGroups(int group) {
        this.groups = group;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
