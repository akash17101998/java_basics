package org.example.singleton;


import java.lang.reflect.Constructor;

public class CallExample{
    public static void main(String[] args) throws Exception{
//        Example e = Example.getExample();
//        System.out.println(e.hashCode());
//
//        Example e1 = Example.getExample();
//        System.out.println(e1.hashCode());

        System.out.println(Example2.getExample2().hashCode());
        System.out.println(Example2.getExample2().hashCode());

//         we can break singleton method by many ways
//         1.Reflection API to break singleton patter
//         sol:- to prevent from reflection API, if object is there => throw exception from inside constructor
//         or use enum


//        Constructor<Example> declaredConstructor = Example.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);  // to make the private method to public
//        Example e2 = declaredConstructor.newInstance();
//        System.out.println(e2.hashCode());   // hashcode is different means we are able to create new object

        Example t = Example.INSTANCE;
        t.test();
    }
}
