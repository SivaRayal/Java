package main.com.ssk.javarefresher.features.java8;

public class LambdaExpression {
    public static void main(String[] args) {
        int a=10,b=20;

        LambdaExpression le=new LambdaExpression();
        System.out.println("Addition and Multiplication earlier java 8 : ");
        System.out.println(le.getAddition(a,b));
        System.out.println(le.getMultiplication(a,b));

        // above can be replaced with lamda expression as
        FunctionalInterface funInt = (String message)->System.out.println("Message From Functional Interface - "+message);
        funInt.getMessage("Hello World");

        // Multip parameter lambda function
        DefaultInterface defInt = (int x,int y)-> System.out.println("Addition from Multi Param lambda function - "+(x+y));
        defInt.getAddition(a,b);
    }

    public int getAddition(int a, int b){
        return a+b;
    }

    public int getMultiplication(int a, int b){
        return a*b;
    }
}
