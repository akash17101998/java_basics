package org.example;

public class Student {

    int id;
    String Name;
    String activity;

    public Student(String Name){
        System.out.println(Name +" is studing");
    }
    public Student(){
        System.out.println("Rohan is studing");
    }

    public void show(){
        System.out.println("Name is :" + Name);
        System.out.println("ID is :" + id );
        System.out.println("Activity :" + activity);
    }
}
