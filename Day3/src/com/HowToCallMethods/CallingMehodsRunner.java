package com.HowToCallMethods;

public class CallingMehodsRunner {
    public static void main(String[] args) {
        CallingMethods call = new CallingMethods();
        call.method();

        System.out.println("  ");

        call.method1(5);
        System.out.println("  ");

        call.method2(5,1,5);
        call.method1(100);


    }
}
