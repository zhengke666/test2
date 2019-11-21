package com.example.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 郑可
 * @date 2019/11/20 9:49
 * @desc
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> amap = new HashMap<>();
        List<Map<String, Object>> alist = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
//                  amap=new HashMap<>();
            System.out.println(amap.hashCode());
            amap.put("a", i);
            amap.put("b", i);
            alist.add(amap);
        }
        System.out.println(alist);
    }
}

