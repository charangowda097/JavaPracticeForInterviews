package com.charan.pracExample.Main;

interface Left{
    default void m1(){
        System.out.println("Left Method");
    }
}

interface Right{
    default void m1(){
        System.out.println("Right Method");
    }
}

/* Static Methods insdie an Interface in Java 8 , by default are not available to the Implementing Class hence if we
want to use the Static Method Function we have to call by using the InterfaceName.methodName(),
if we try to call using Object of the Implementing class/Directly by Class Name then there will be
a Compilation time error
 */
interface Interf{
    public static void sum(int a,int b){
        System.out.println("Sum:"+(a+b));
    }
}
public class Demo3 implements Left,Right,Interf{

    @Override
    public void m1() {
        Right.super.m1(); /*In case of Multiple Inheritance or implementation of Multiple Functional Interfaces
                          implementation we have to override the method or Use one of the Existing methods
                          using InterfaceName.super.methodName()
                          Left.super.m1() --> Left Method
                          */
    }

    public static void main(String[] args) {
        Demo3 d3=new Demo3();
        d3.m1();
        Interf.sum(10,20);
    }


}
