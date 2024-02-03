package com.charan.pracExample.Main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Predicate Example to remove null values and empty String
public class PredicateExample3 {
    public static void main(String[] args) {

        List<String> str= Arrays.asList("Charan",null,"Varun","Asha");
        Predicate<String> p1=(s)->s!=null&&s.length()!=0;
        for(String s:str){
            if(p1.test(s)){
                System.out.println(s);
            }
        }

    }
}
