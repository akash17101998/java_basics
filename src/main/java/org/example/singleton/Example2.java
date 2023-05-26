package org.example.singleton;
// eager way of creating singleton object
public class Example2{
    private static Example2 example2 = new Example2();

    public static Example2 getExample2(){

        return example2;
    }
}
// already provide an object that is in use or not
// example:- if a client don't want an object but if already provide an object, so it is not good in this case
// so it make it's performance down because if we create 10 object but that object not in use