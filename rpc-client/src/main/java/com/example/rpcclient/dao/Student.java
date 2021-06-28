package com.example.rpcclient.dao;

public class Student {
    String username;
    String age;
    String hobby;
    String key;
    String value;


    public Student(){

    }


    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }


    public String getUsername() {
        return username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
