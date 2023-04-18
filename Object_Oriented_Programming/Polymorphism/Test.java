package com.Prabal.Object_Oriented_Programming.Polymorphism;

public class Test {
    int a;
    Test(int i){
        a = i;
    }
    Test IncByTen(){
        Test temp =  new Test(a+10);
        return temp;
    }
}
class ReturnObj{
    public static void main(String[] args) {
        Test obj1 = new Test(2);
        Test obj2;

        obj2 = obj1.IncByTen();

        System.out.println("Object a : "+obj1.a);
        System.out.println("Object a : "+obj2.a);
    }
}



