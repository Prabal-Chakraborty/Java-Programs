package com.Prabal.Object_Oriented_Programming.Generics;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i <5 ; i++) {
//            arr.add(1+i);
//        }
//        arr.forEach((item) -> System.out.print((item*2) + " " ));  //o/p - 2 4 6 8 10

        Opertion sum = (a,b) -> a+b;
        Opertion sub = (a,b) -> a-b;
        Opertion prod = (a,b) -> a*b;

        LambdaFunctions myCal = new LambdaFunctions();
        System.out.println(myCal.operate(1,111,sub));
        System.out.println(myCal.operate(777,111,sum));
        System.out.println(myCal.operate(476,1232,prod));

    }

    interface Opertion{
        int operation(int a, int b);
    }
    private int operate(int a, int b, Opertion op){
        return op.operation(a,b);
    }
}
