package org.example;

public class Oriding {
// overridden method
    public void m1(){
        System.out.println("this is parent class");
    }
}

class Child extends Oriding{
    // overridding method
    public void m1(){
        System.out.println("this is child class");
    }

}
