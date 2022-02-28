package com.camiller.mybatis.entity;

/**
 * @author Camille
 * @create 2022-02-23 22:05
 */
public class User {

    private int userId;
    private String userName;
    private String email;
    private int age;
    private String gender;

    public User() {
    }

    public User(int userId, String userName, String email, int age, String gender) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
