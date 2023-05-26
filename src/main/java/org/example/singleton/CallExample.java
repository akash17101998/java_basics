package org.example.singleton;

public class CallExample{
    public static void main(String[] args){
        Example e = Example.getExample();
        System.out.println(e.hashCode());

        Example e1 = Example.getExample();
        System.out.println(e1.hashCode());

        System.out.println(Example2.getExample2().hashCode());
        System.out.println(Example2.getExample2().hashCode());
    }
}
