package com.ssk.java.dsaprep.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"Hello Learner");
        map.put(2, "Lets Learn Java Collections");
        map.put(3,"We are going to crack DSA rounds");

        System.out.println(map);

        for(Map.Entry<Integer,String> entrySet:map.entrySet()){
            System.out.println(entrySet.getKey()+" : "+entrySet.getValue());
        }

        if(map.containsKey(2))
            System.out.println("Key Found");
        else
            System.out.println("Key - Not Found");

        if(map.containsValue("Hello Learner"))
            System.out.println("Value found");
        else
            System.out.println("Value - Not found");
    }
}
