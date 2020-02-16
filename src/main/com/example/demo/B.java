package com.example.demo;

import java.math.BigDecimal;

/**
 * @Author: 郑可
 * @Date: 2019/12/26 10:35
 * @Desc:
 */
public class B {

    static User user = new User();

    public static void main(String[] args) {
//        Integer i = 12;
//        i += i -= i *= i;
//        System.out.println(i);

//        BigDecimal a = new BigDecimal("1.00");
//        BigDecimal b = new BigDecimal("1.0000");
//        System.out.println(a == b);

        String  a = "1";
        String b = "00000" + a;
        b = b.substring(b.length()-5);
        System.out.println(b);
        user.queryAll(a,b);

        String ss = "/data/rop/person.json";

        int one = ss.lastIndexOf(".");
        String Suffix = ss.substring((one+1),ss.length());
        System.out.println(Suffix); //json

        int one1 = ss.lastIndexOf("/");
        String Suffix1 = ss.substring((one1+1),ss.length());
        System.out.println(Suffix1); //person.json

        String  prefix= ss.substring(0,ss.lastIndexOf("/"));
        System.out.println(prefix);

    }

}
