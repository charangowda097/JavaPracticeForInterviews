package com.charan.pracExample.Main;

import com.charan.pracExamples.interf.FIAddExample;
import com.charan.pracExamples.interf.FIExample2;
import com.charan.pracExamples.interf.FunctionalInterfaceExample1;

public class Demo1 {
    public static void main(String[] args) {
        FunctionalInterfaceExample1 i=()->System.out.println("Hello World From Lambda Expression");
        i.methodOne();

        FIExample2 j=()->System.out.println("Hello World From Second Functional Interface Lambda Expression");
        j.methodTwo();

        FIAddExample z=(a,b)->System.out.println("Addition Result from the Lambda Expression" +
                " Implementation of Functional Interface:"+(a+b));
        z.add(10,10);

        Runnable r=()->{
            for(int a=0;a<10;a++){
                System.out.println("Child Thread");
            }
        };
        Thread t=new Thread(r);
        t.start();

        for(int i1=0;i1<10;i1++){
            System.out.println("Main Thread");
        }
    }
}
