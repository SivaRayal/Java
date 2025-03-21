package com.ssk.java.dsaprep.collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> lm=new LinkedHashMap<>();
        lm.put(10,"Lets");
        lm.put(20,"Kill");
        lm.put(40,"Some Problems");
        lm.put(60,"today");
        lm.put(30,"Hell.. Yeah");

        System.out.println(lm);

        lm.remove(30);
        System.out.println(lm);
    }
}
