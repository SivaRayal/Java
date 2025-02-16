package main.com.ssk.java.features.java8;

@java.lang.FunctionalInterface
public interface DefaultInterface {
    void getAddition(int a,int b);

    // default methods are allowed in Interfaces
    default void getMultiplication(int a, int b){
        System.out.println("Multiplication - "+a*b);
    }
}
