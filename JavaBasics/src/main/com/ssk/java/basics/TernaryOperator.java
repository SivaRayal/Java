package main.com.ssk.java.basics;

public class TernaryOperator {
    public static void main(String[] args) {
        // (condition) ? true case : false case ;
        int a=10,b=-10;
        System.out.println("a="+a+" b="+b);

        String output=(a>b)?"a is greater than b ":"b is greater than a";
        System.out.println(output);
    }
}
