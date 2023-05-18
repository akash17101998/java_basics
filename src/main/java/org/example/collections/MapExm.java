package org.example.collections;
import java.util.HashMap;

public class MapExm {

    public static void main(String args[]){
        HashMap<String , Integer> course = new HashMap<>();
        course.put("english",1000);
        course.put("Java",4000);
        System.out.println(course);
        course.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }
}
