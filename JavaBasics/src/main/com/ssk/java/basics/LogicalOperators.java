package main.com.ssk.java.basics;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a=true,b=false,i=true,y=false;

        // && - AND Operator - both are true
        System.out.println("true && false : "+(a&&b));
        System.out.println("true && true : "+(a&&i));
        System.out.println("false && false : "+(b&&y));

        // || - OR Operator - either one of then should be true.
        System.out.println("true || false : "+(a||b));
        System.out.println("true || true : "+(a||i));
        System.out.println("false || false : "+(b&&y));

    }
}
