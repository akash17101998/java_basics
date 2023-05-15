package org.example;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student student = new Student("Mohan");
        Student student1 = new Student();
        student.id = 1;
        student.Name = "akash";
        student.activity = "study";

        student.show();
//        student.study();
        Dog dog = new Dog();
        dog.eating();
//        dog.color = "Black";
        System.out.println(dog.color);
        dog.show();
    }
}