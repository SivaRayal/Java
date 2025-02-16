package main.com.ssk.javarefresher.basics;

public class PrintNewLine {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("There..!");
    }

    public void printIntNewLine(int a,int b,int c){
        System.out.println("a - "+a);
        System.out.println("b - "+b);
        System.out.println("c - "+c);
    }

    static <T> void printNew(T element){
        System.out.println(element.getClass().getName()+" - "+element);
    }
}
