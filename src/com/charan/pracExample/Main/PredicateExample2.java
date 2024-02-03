package com.charan.pracExample.Main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Program to display names starting with 'K'
public class PredicateExample2 {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("Charan","Karan","Kiran","Kaatera","Varun");
        Predicate<String> p=(s)->s.startsWith("K");

        System.out.println("Names Staring with Letter 'K':");
        for(String str:names){
            if(p.test(str)){
                System.out.println(str);
            }
        }
    }
}
