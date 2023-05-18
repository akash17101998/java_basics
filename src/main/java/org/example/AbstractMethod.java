package org.example;

abstract public class AbstractMethod {
    public void set(){
        System.out.println("hello");
    }

    // abstract method
    abstract public void show();
}


//Rule1: we cannot create object of abstract class
// Rule2: agar iska child class isko extend kr rha h or child class k parent class me koi abstract method h to we have must define
// the body of that abstract method otherwise the child class become abstract class
// we call the method through child class