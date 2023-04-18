package com.Prabal.Object_Oriented_Programming.Polymorphism;

public class ObjectPrint {
    int num = 55;
    ObjectPrint(){
        this.num=num;
    }
    @Override // This is an annotation to check whether a method is overridden or not !!!

    // It'll check over obj that we have passed, does it have a toString(), if No it doesn't it'll use the default one !
    // So we'll provide our own toString()
    public String toString(){
        return "ObjectPrint{ " + "num= " + num +" }";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint();
        System.out.println(obj);
    }
}
