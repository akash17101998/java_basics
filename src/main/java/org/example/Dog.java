package org.example;

public class Dog extends Inherit {
    int x = 10;
public void show(){
    super.color = "Yellow";   // super keyword is used to call the var./method of parent class
    System.out.println(x);    // it will call the value of same class
    System.out.println(this.x);   // it will also call the value of same class
    System.out.println(super.x);  // to call the value of parent class
}


public Dog(){
    super();   // calling constructor of parent class and it must be first line

}
}
