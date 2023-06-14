package org.example;

public interface Parent {
// by using interface we can achieve 100% of abstraction
    int i =43; // this is not normal var like class var. it contain "public static final"

    void cal();   // bydefault it contains "public abstact"
}

class Child1 implements Parent{
    public void cal(){
        System.out.println("hello is child interface");
    }
    public void show(){
        System.out.println("this is show method");
    }
    public static void main(String arg[]){
        Parent parent = new Child1();
        parent.cal();

    }
}
