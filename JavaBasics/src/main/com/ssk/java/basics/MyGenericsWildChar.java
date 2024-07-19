package main.com.ssk.java.basics;

import java.util.ArrayList;

public class MyGenericsWildChar {
    public static void printAll(ArrayList<? extends Student> al){
        for(Student e:al){
            e.print();
        }
    }
}

class Student {
    void print(){
        System.out.println("Student");
    }
}

class EnggStudent extends Student{
    void print(){
        System.out.println("Engineering Student");
    }
}

class MgmtStudent extends Student{
    void print(){
        System.out.println("Management Student");
    }
}

class TestMyGenericsWildChar {
    public static void main(String[] args) {
        Student s = new Student();
        EnggStudent es = new EnggStudent();
        MgmtStudent ms=new MgmtStudent();
        ArrayList<Student> al = new ArrayList<>();
        al.add(s);
        al.add(es);
        ArrayList<MgmtStudent> al2 = new ArrayList<>();
        al2.add(ms);

        MyGenericsWildChar.printAll(al);
        MyGenericsWildChar.printAll(al2);
    }
}