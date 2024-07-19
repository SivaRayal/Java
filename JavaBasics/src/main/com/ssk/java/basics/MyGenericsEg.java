package main.com.ssk.java.basics;

public class MyGenericsEg<T>{
    T x;
    public static int count;
    MyGenericsEg(){
        count++;
    }
}

class TestMyGenericsEg{
    public static void main(String[] args) {
        MyGenericsEg<Integer> m1 = new MyGenericsEg<>();
        MyGenericsEg<Integer> m2 = new MyGenericsEg<>();
        System.out.println(MyGenericsEg.count);
    }
}