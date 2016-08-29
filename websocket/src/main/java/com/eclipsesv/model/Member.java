package com.eclipsesv.model;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Size;

/**
 * Created by eclipse on 16/8/24.
 */
public class Member {
    @Id
    private String id;

    @Size(min = 3,max = 10)
    private String username;

    @Email
    private String email;

    @Size(min = 6, max = 14)
    private String password;

    public Member() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }
}
