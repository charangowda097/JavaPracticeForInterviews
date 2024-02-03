package com.charan.pracExample.Main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionsExample1 {
    public static void main(String[] args) {

        Function<String,Integer> stringLength=s->s.length();
        List<String> strings= Arrays.asList("Charan","Varun","Asha");
        for(String str:strings){
            System.out.println("String Length values of: "+str+" Returned by Function" +
                    " Functional Interface:"+stringLength.apply(str));
        }

        //remove all Spaces in String
        Function<String,String> removeSpaces=s -> s.replace(" ","");
        String s="Charan resides in Bengaluru";
        System.out.println("String before Removing Spaces:"+s);
        System.out.println("String after Removing Spaces:"+removeSpaces.apply(s));

        //to Find Number of Spaces Present in String by using Function
        Function<String,Integer> lengthPostSpaceRemoval=s1->s1.length()-s1.replace(" ","").length();
        System.out.println("Length After Removing Spaces:"+lengthPostSpaceRemoval.apply(s));
    }


}
