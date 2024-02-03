package com.charan.pracExamples.interf;

// If we do not include @FunctionalInterface then there will be no compilation error as this is just a Normal Method
public interface FIExample2 {
    public void methodTwo();
}

// When we include the Annotation then there will be a compilation error as Functional Interfaces can contain only 1 Abstract method
/*@FunctionalInterface
public interface FIExample2 extends FunctionalInterfaceExample1{
    public void methodTwo();
}*/


