package main.com.ssk.javarefresher.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsEg {
    public static void main(String[] args) {
        // Print first n natural numbers with given digit d.
        Stream.iterate(1,x->x+1).filter(x->x.toString().contains("5")).limit(10).forEach(System.out::println);

        int[] arr={10,20,30};
        System.out.println("Average - "+Arrays.stream(arr).average().getAsDouble());

        StudentObj1[] studentList={
                new StudentObj1(01,75,"Siva"),
                new StudentObj1(02,95,"Krishna"),
                new StudentObj1(03,89,"Sai")
        };
        Map<Integer,String> m = Arrays.stream(studentList).collect(Collectors.toMap(StudentObj1::getRoll,StudentObj1::getName));
        System.out.println(m);

        List<StudentObj1> stdList=Arrays.asList(studentList);
        stdList.stream().map(StudentObj1::getName).map(String::toUpperCase).forEach(System.out::println);
    }
}

class StudentObj1{
    int roll,marks;
    String name;
    StudentObj1(int roll,int marks,String name){
        this.name=name;
        this.marks=marks;
        this.roll=roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}