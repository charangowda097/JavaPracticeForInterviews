package com.charan.pracExample.Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String[] args) {
        Predicate<Integer> p1=i ->(i>10);
        System.out.println(p1.test(5));
        System.out.println(p1.test(10));

        Predicate<String> s1=s->(s.length()>5);
        System.out.println(s1.test("Charan"));

        Predicate<Collection> p=c->c.isEmpty();
        List<Integer> l=new ArrayList<>();
        System.out.println(p.test(l));

        int[] x={0,05,10,15,20,25,30};
        Predicate<Integer> p3=i->i>10;
        Predicate<Integer> p4=i->i%2==0;

        System.out.println("Numbers greater than 10:");
        m1(p3,x);

        System.out.println("Even Numbers are:");
        m1(p4,x);

        System.out.println("The Numbers which are not greater than 10 are:");
        m1(p3.negate(),x);

        System.out.println("The Numbers greater than 10 and Even are:");
        m1(p3.and(p4),x);

        System.out.println("The Numbers greater then 10 or Even are:");
        m1(p3.or(p4),x);

    }

    private static void m1(Predicate<Integer> p, int[] x) {
        for(int x1:x){
            if(p.test(x1)){
                System.out.println(x1);
            }
        }
    }
}
