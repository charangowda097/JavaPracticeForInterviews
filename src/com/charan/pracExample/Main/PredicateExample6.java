package com.charan.pracExample.Main;


import com.charan.Model.Employee;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample6 {
    public static void main(String[] args) {
        ArrayList<Employee> l=new ArrayList<>();
        populate(l);
        Predicate<Employee> isManager=e->e.designation.equals("Manager");
        System.out.println("Manager's Information");
        display(isManager,l);
        System.out.println("**************************************************");
        Predicate<Employee> bangaloreEmployees=e->e.city=="Bangalore";
        System.out.println("Bangalore Employee Information");
        display(bangaloreEmployees,l);
        System.out.println("**************************************************");
        Predicate<Employee> salaryLessThan20=e->e.getSalary()<20000;
        System.out.println("Employees whose salary is less than 20000");
        display(salaryLessThan20,l);
        System.out.println("**************************************************");
        System.out.println("Employees Who are Managers and from Bangalore");
        display(isManager.and(bangaloreEmployees),l);
        System.out.println("**************************************************");
        System.out.println("Employees Information Who are either Manager or Salary < 20000");
        display(isManager.or(salaryLessThan20),l);
        System.out.println("****************************************************");
        System.out.println("All Employees Information Who are not Managers");
        Predicate<Employee> notEqualToManagerDesg=e->e.getDesignation().equals("Manager");
        display(notEqualToManagerDesg.negate(),l);
        System.out.println("****************************************************");
    }

    private static void display(Predicate<Employee> isManager, ArrayList<Employee> l) {
        for (Employee e:l) {
            if(isManager.test(e)){
                System.out.println(e);
            }
        }
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
