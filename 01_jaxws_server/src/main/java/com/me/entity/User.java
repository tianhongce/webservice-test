package com.me.entity;

import java.util.ArrayList;

public class User {
    private String userId;
    private String userName;
    private int userAge;
    private ArrayList<String> userTest;

    public User() {
    }

    public User(String userId, String userName, int userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
    }

    public User(String userId, String userName, int userAge, ArrayList<String> userTest) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.userTest = userTest;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public ArrayList<String> getUserTest() {
        return userTest;
    }

    public void setUserTest(ArrayList<String> userTest) {
        this.userTest = userTest;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userTest=" + userTest +
                '}';
    }
}
