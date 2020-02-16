package com.example.test;

import org.apache.commons.lang.math.NumberUtils;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Author: 郑可
 * @Date: 2019/11/29 14:57
 * @Desc: 123
 */
public class Demo {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal(5);
        BigDecimal b = new BigDecimal(1);
        BigDecimal add = a.add(b);
        System.out.println(add);
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            myArrayList.add(i);
            Collections.sort(myArrayList, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
//                    return o1.compareTo(o2);//注意这里的顺序。此时是需要降序;
                    return o2-o1;//注意这里的顺序。此时是需要降序;
                }
            });

        }
        for(int i=0;i<5;i++){
            System.out.print(myArrayList.get(i)+" ");
        }


        String str = "100424060\\";
        System.out.println(str);
        System.out.println(NumberUtils.isDigits(str));
    }
}
