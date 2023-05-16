package org.example;

public class Poly {
    // polymorphism stands for many form there are 2 types
//    1. Static type/ static binding/ compile time polymorphism
//    ex:- method m1(int i)   // used in method overloading
//        method m1(double i)
//            m1(2),m1(2.3)  // during compile time the compile know which method is used

    public void overload(){
        System.out.println("without parameter");
    }

    public void overload(int i){
        System.out.println("with parameter");
    }




    public static void main(String[] args){
        Poly poly = new Poly();
        poly.overload();              // during the compile time we know which method is calling
        poly.overload(1);           // by using the parameter we can call any method in method overloading

    }

}
