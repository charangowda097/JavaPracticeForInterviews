package com.charan.Model;

public class Employee {
    public String empName;
    public String designation;
    public double salary;
    public String city;

    public Employee(String empName, String designation, double salary, String city) {
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}
