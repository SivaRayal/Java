package main.com.ssk.javarefresher.basics;

import java.util.*;

public class CollectionsBulkOperations {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = Arrays.asList(1,20,3,40);
        Queue<Integer> q1=new ArrayDeque<>();
        q1.addAll(Arrays.asList(1,10,20,30,40));

        System.out.println("List1 - "+list1);
        System.out.println("List2 - "+list2);
        System.out.println("Q -"+q1);
        System.out.println(list1.containsAll(q1));

        System.out.println(list1.addAll(list2));
        System.out.println("List1 - "+list1);
        System.out.println("List2 - "+list2);
        System.out.println("Q -"+q1);

        System.out.println(list1.removeAll(list2));
        System.out.println("List1 - "+list1);
        System.out.println("List2 - "+list2);
        System.out.println("Q -"+q1);

        System.out.println(list1.retainAll(list2));
        System.out.println("List1 - "+list1);
        System.out.println("List2 - "+list2);
        System.out.println("Q -"+q1);

        System.out.println(list1.addAll(q1));

        System.out.println("List1 size - "+list1.size());
        System.out.println("List2 size - "+list2.size());
        System.out.println("Q -"+q1.size());

        System.out.println(q1.removeIf(x->(x%2==0)));
        System.out.println("List1 - "+list1);
        System.out.println("List2 - "+list2);
        System.out.println("Q -"+q1);

        list1.forEach(x-> System.out.print(x+" "));
        list2.forEach(System.out::println);

        list1.stream().filter(x->x%2==0).forEach(System.out::print);
    }
}
