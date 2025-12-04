package com.ssk.java.dsaprep.collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<Integer> s=new HashSet<>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(20);

        Iterator<Integer> it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        Set<String> strSet=new LinkedHashSet<>();
        strSet.add("Hi");
        strSet.add("Today is");
        strSet.add("a beautiful");
        strSet.add("day");
        strSet.add("day");

        for(String str:strSet){
            System.out.println(str);
        }
    }
}
