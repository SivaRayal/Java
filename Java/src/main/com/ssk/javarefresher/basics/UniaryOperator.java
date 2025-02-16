package main.com.ssk.javarefresher.basics;

public class UniaryOperator {
    public static void main(String[] args) {
        // + : unary plus
        int a=+10;

        // - : unary minus
        int b=-10;

        System.out.println("a="+a+" b="+b);

        // ++ : Increment
        int c=a++;
        int d=++b;
        System.out.println("c="+c+" d="+d);

        // -- : Decrement
        int e=--c;
        int f=d--;
        System.out.println("e="+e+" f="+f);

        // ! : logical not
        boolean flag=true;
        System.out.println("!(true) : "+ (!flag));
    }
}
