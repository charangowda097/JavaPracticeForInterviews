package com.charan.pracExample.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Program to check whether Software Engineer is allowed into Pub or not by using Predicate
class SoftwareEngineer{
    String name;
    int age;
    boolean isHavingGf;

    SoftwareEngineer(String name,int age,boolean isHavingGf){
        this.name=name;
        this.age=age;
        this.isHavingGf=isHavingGf;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class PredicateExample5 {
    public static void main(String[] args) {
      List<SoftwareEngineer> al=new ArrayList<>();
      al.add(new SoftwareEngineer("Charan",26,false));
      al.add(new SoftwareEngineer("Varun",29,true));
      al.add(new SoftwareEngineer("Dhruvan",37,true));

        Predicate<SoftwareEngineer> p=(s)-> s.age>18 && s.isHavingGf==true;
        for(SoftwareEngineer s:al){
            if(p.test(s)){
                System.out.println(s);
            }
        }
    }
}
