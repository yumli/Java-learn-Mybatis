package com.camille.mybatis.pojo;

/**
 * @author Camille
 * @create 2022-02-23 22:05
 */
public class User {

    private Integer userId;
    private String userName;
    private String email;
    private String password;
    private int age;
    private String gender;



    public User() {
    }

    public User(Integer userId, String userName, String email, String password, int age, String gender) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
