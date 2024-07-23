package main.com.ssk.java.basics;

import java.util.Arrays;
import java.util.List;

public class LambdaEg {
    static void printFunc(Testfunctionalinterface1 ti, String str){
        ti.print(str);
    }

    public static void main(String[] args) {
        printFunc(x-> System.out.println(x),"Hi There..!");

        point[] coords={
                new point(10,20),
                new point(5,25),
                new point(35,45)
        };
        for(point p:coords)
            System.out.println(p.toString());
        System.out.println(" ------- ascending order of points array based on x -----------");
        Arrays.sort(coords, (p1,p2)->p1.x-p2.x);
        for(point p:coords){
            System.out.println(p.x+" "+p.y);
        }

        List<Character> charList = Arrays.asList('s','i','v');
        charList.forEach(x-> System.out.print(x));

    }
}

interface Testfunctionalinterface1 {
    void print(String str);
}

class point{
    int x,y;
    point(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return x+" "+y;
    }
}