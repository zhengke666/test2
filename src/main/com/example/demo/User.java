package com.example.demo;

/**
 * @Author: 郑可
 * @Date: 2019/12/21 21:54
 * @Desc:
 */
public class User {
    int data;

    public User(int data) {
        this.data = data;
    }

    public User() {
    }

    public int getData1() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "User{" +
                "data=" + data +
                '}';
    }

    public void queryAll(String a, String b) {

    }
}
