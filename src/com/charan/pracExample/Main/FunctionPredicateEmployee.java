package com.charan.pracExample.Main;

import com.charan.Model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPredicateEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> l=new ArrayList<>();
        populate(l);

        //Find the Monthly Salary of All Employees Using Function Interface
        Function<List<Employee>,Double> totalSalaryFunction=e->{
            double total=0;
            for (Employee emp:e) {
               total=total+emp.getSalary();
            }
            return total;
        };
        System.out.println("The Total Salary of this Month:"+totalSalaryFunction.apply(l));
    }

    private static void populate(ArrayList<Employee> list) {
        list.add(new Employee("Durga","CEO",30000,"Hyderabad"));
        list.add(new Employee("Sunny","Manager",20000,"Hyderabad"));
        list.add(new Employee("Mallika","Manager",20000,"Bangalore"));
        list.add(new Employee("Kareena","Lead",15000,"Hyderabad"));
        list.add(new Employee("Katrina","Lead",15000,"Bangalore"));
        list.add(new Employee("Anushka","Developer",10000,"Hyderabad"));
        list.add(new Employee("Kanushka","Developer",10000,"Hyderabad"));
        list.add(new Employee("Sowmya","Developer",10000,"Bangalore"));
    }
}
