package org.example;
public class ExceptHandle {
    public static void main(String[] args) {
        System.out.println("program started...");
        try {
            int n1 = 10;
            int n2 = 0;
            System.out.println("numbers");
            int div = n1/n2;
            System.out.println(div);
        }catch (ArithmeticException | NumberFormatException e){   // define multiple exception in single catch
            System.out.println(e.getMessage());
            System.out.println("number can not be 0");
        }catch (NullPointerException e){
            System.out.println("number cannot be string");
        }catch (Exception e){
            System.out.println("error!!");
            System.out.println(e.getMessage());
        }finally {
            // always gets executed...
            System.out.println("it will executed always");
        }
    }
}
