package com.ssk.java.dsaprep.collections.map.treemap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(1,"Today");
        tm.put(100,"Beautiful");
        tm.put(50,"is a");
        tm.put(150,"day");

        System.out.println(tm);

        System.out.println("ceilingKey : "+tm.ceilingKey(59));
        System.out.println("floorKey : "+tm.floorKey(49));
        System.out.println("firstKey : "+tm.firstKey());
        System.out.println("lastKey : "+tm.lastKey());
    }
}
