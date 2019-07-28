package com.example01.entity;

import java.io.Serializable;

/**
 * @author 杨军
 * @version 1.0
 * @date 2019/07/27 0027 上午 10:33
 */

public class User implements Serializable {
    private Integer id;
    private String username;
    private String age;
    private String skill;
    private String address;
    private String beckon;

    public User() {
    }

    public User(Integer id, String username, String age, String skill, String address, String beckon) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.skill = skill;
        this.address = address;
        this.beckon = beckon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBeckon() {
        return beckon;
    }

    public void setBeckon(String beckon) {
        this.beckon = beckon;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age='" + age + '\'' +
                ", skill='" + skill + '\'' +
                ", address='" + address + '\'' +
                ", beckon='" + beckon + '\'' +
                '}';
    }
}
