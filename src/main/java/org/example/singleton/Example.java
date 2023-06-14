package org.example.singleton;

// the concept of singleton is to create only one object of a class and use this object
//public class Example{
//    private static Example example;   //static var because we can't initialize the var inside static method to initialize it we make it static
//// constructor must be private
//    private Example(){
//        if(example!=null){            // it will protect from reflection API
//            throw new RuntimeException("You are trying to break singleton pattern");
//        }
//    }
//
//    // lazy way to creating single object
//    // this is method sync. but that is good option
//    public static Example getExample(){  // static to directly call the constructor without making the object
//    if (example==null){
////        example = new Example();
//        synchronized (Example.class){ // sync. block
//            if (example==null){
//                example = new Example();
//            }
//        }
//    }
//    return example;
//    }
//}


//  by using enum we can protect from reflection API
public enum Example{
    INSTANCE;

    public void test(){
        System.out.println("this is test method");
    }
}

// when we call the method only that time the object will create
// if there is multiple threads or if thread safety is an important usecase of the project than it will create problem
// because multiple object can create multiple object to overcome this problem we can use synchronized
// so if one thread is working due to sync. the other thread will wait for the completion of first thread
