package org.example.generics;

public class Box1 {
    public static void main(String[] args){
        Box box = new Box("this is string");
        System.out.println(box.getValue());
        box.container = 2123;
        System.out.println(box.getValue());
        System.out.println("-------------------------");
        Example<String> s1 = new Example<>("this is string generic");  // we give the string type here, it make the data type of example class string type
//        s1.data = "dsfs";
        System.out.println(s1.getValue());
        Example<Integer> s2 = new Example<>(12);
        System.out.println(s2.getValue());

    }
}
