package com.charan.pracExample.Main;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
    String userName;
    String pwd;
    User(String userName,String pwd){
        this.userName=userName;
        this.pwd=pwd;
    }
}
// Program for User Authentication using Predicate
public class PredicateExample4 {
    public static void main(String[] args) {
        Predicate<User> p=u->u.userName.equals("Charan")&&u.pwd.equals("Java");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter User Name:");
        String uname=scan.nextLine();
        System.out.println("Enter Password Here:");
        String usrpwd=scan.nextLine();
        User u=new User(uname,usrpwd);
        if(p.test(u)){
            System.out.println("User Name:"+(u.userName)+" is a Valid User and can access System");
        }
        else{
            System.out.println("Invalid User");
        }
    }
}
