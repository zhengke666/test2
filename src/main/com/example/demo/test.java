package com.example.demo;

/**
 * @Author: 郑可
 * @Date: 2019/12/21 21:53
 * @Desc:
 */
public class test {

    public static void main(String[] args) {
        /*User user = new User(1);
        User user2 = new User(2);
        user.getData1();
        user.getData1();
        user.getData1();
        User use1 = user;
        use1 = user2;
        System.out.println(user);*/

        String a = "1,0";
        a =  a.substring(0,a.lastIndexOf(","));
        System.out.println(a);

    }
}
