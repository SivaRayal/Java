package com.ssk.java.dsaprep.collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<String> strSet=new TreeSet<>();
        strSet.add("Hello");
        strSet.add("Learner");
        strSet.add("How is it going");
        strSet.add("Hi");
        strSet.add("We made it");

        for(String s:strSet)
            System.out.println(s);

        TreeSet<Integer> numSet = new TreeSet<>();
        numSet.add(5);
        numSet.add(25);
        numSet.add(20);
        numSet.add(15);
        numSet.add(10);
        numSet.add(13);
        System.out.println(numSet);

        numSet.remove(13);
        System.out.println(numSet);

        System.out.println("Lower : "+numSet.lower(15));
        System.out.println("Higher : "+numSet.higher(15));
        System.out.println("Floor : "+numSet.floor(13));
        System.out.println("Celing : "+numSet.ceiling(13));
    }
}
