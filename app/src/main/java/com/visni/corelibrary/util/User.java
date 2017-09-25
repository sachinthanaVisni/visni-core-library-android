package com.visni.corelibrary.util;

/**
 * Created by ransikadesilva on 9/25/17.
 */

public class User {

    private String authToken;
    private String username, password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.setAuthToken(username + "1234New");
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
