package com.example.test;


import java.util.ArrayList;
import java.util.List;

public class HappyNewYear {
    public static void main(String[] args) {
        System.out.println("happy new year");
        System.out.println("hello word");

        String str = "01.06.02.03.05"+".";
        String[] split = str.split("\\.");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if (i == 0){
                list.add(""+ split[i]);
            }else {
                list.add(list.get(i-1)+"."+split[i]);
            }
        }
        System.out.println(list);
    }
}
