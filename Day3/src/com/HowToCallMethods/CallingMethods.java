package com.HowToCallMethods;

public class CallingMethods {
 //   Practice how to call the methods from different methods
    public void method(){
        method1(5);

    }
    public void method1(int speed) {
        //call testSpeed(from and to)methods from here
        method2(4, 5, 10);
        for (int i=1;i<=10;i++){
            System.out.printf("%d*%d=%d",speed,i,speed*i).println();
        }

    }
    public void method2(int method,int from, int to){
        for (int i=from;i<=to;i++){
            System.out.printf("%d*%d=%d",method,i,method*i).println();
        }
    }
}
