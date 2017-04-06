package org.launchcode.models;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Required;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Brady on 3/22/17.
 */

public class User {

    @NotNull
    @Size(min=5, max=15, message="Username must be between 5 and 15 characters long")
    private String username;

    @Email
    private String email;

    @NotNull
    @Size(min=6, message="Password must be at least 6 characters long")
    private String password;

    @NotNull(message="Passwords do not match")
    private String verifyPassword;

    private int userId;
    private static int nextId = 1;

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {
        this.userId = nextId;
        this.nextId++;
    }

    private void checkPassword(String password, String verifyPassword) {
        if (!password.equals(verifyPassword)) {
            verifyPassword = null;
        }
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
        checkPassword(this.password, verifyPassword);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword(password, this.verifyPassword);
    }
}