package com.pixel.tryc;

public class MainClass {
    public static void main(String[] args) {
        try {
            // Code in main that may throw an exception
            someMethod(); // Calling another method
        } catch (Exception e) {
            // Handle exception thrown in main method or someMethod
            System.out.println("Exception caught in main: " + e);
        }
    }
    public static void someMethod() {
        try {
            // Code in someMethod that may throw an exception
            int result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            // Handle exception thrown in someMethod
            System.out.println("Exception caught in someMethod: " + e);
        }
    }
}
