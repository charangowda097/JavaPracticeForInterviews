package com.charan.pracExample.Main;

import com.charan.Model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// Find Student Grade using Function
public class FunctionPredicateStudentExample {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        populate(students);
        Function<Student,String> gradeFunction=p->{
            if(p.getMarks()>=80){
                return "A[Distinction]";
            }
            else if (p.getMarks()>=60){
                return "B[First Class]";
            } else if (p.getMarks()>=50) {
                return "C[Second Class]";
            } else if (p.getMarks()>=35) {
                return "D[Third Class]";
            }
            else{
                return "F[Failed]";
            }
        };
        for(Student s:students){
            System.out.println("Student Name:"+s.getName());
            System.out.println("Student Marks:"+s.getMarks());
            System.out.println("Student Grade:"+gradeFunction.apply(s));
        }

        Predicate<Student> marksGreaterThan60=p->p.getMarks()>=60;
        Consumer<Student> c=s->{
            System.out.println("Student Name:"+s.getName());
            System.out.println("Student Marks:"+s.getMarks());
            System.out.println("Student Grade:"+gradeFunction.apply(s));
        };
        System.out.println("***********************************");
        System.out.println("Students Info grater than 60:");
        for(Student s:students){
            if(marksGreaterThan60.test(s)){
               /* System.out.println("Student Name:"+s.getName());
                System.out.println("Student Marks:"+s.getMarks());
                System.out.println("Student Grade:"+gradeFunction.apply(s)); */
                c.accept(s);
            }
        }

    }

    private static void populate(List<Student> students) {
        students.add(new Student("Sunny",100));
        students.add(new Student("Bunny",65));
        students.add(new Student("Chinny",55));
        students.add(new Student("Vinny",45));
        students.add(new Student("Pinny",25));
    }
}
