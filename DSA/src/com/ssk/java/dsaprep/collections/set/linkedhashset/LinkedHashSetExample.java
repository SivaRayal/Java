package com.ssk.java.dsaprep.collections.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> s=new LinkedHashSet<>();
        s.add(10);
        s.add(30);
        s.add(20);
        s.add(25);
        s.add(40);

        s.remove(25);

        System.out.println(s);
    }
}
