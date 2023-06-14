package org.example;

public class RuntimePoly {
    //    2. Dynamic type/ dynamic binding/ runtime
    // used in method overriding
//    ex:- method m1()           // parent class
//        method m1()             // child class
//
//    m1()   // the compiler don't know which method is used , so during runtime we call the method through the child class or parent class
//


        public void show(){
            System.out.println("this is parent");
        }
    }
    class OverrideChild extends RuntimePoly{
        public void show(){
            System.out.println("this is child ");
        }

    public static void main(String[] args){
        RuntimePoly runtimePoly = new RuntimePoly();
        runtimePoly.show();                            // calling parent

        RuntimePoly overrideChild = new OverrideChild();         // calling child at runtime
        overrideChild.show();

    }
}
