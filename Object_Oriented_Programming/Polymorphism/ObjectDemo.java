package com.Prabal.Object_Oriented_Programming.Polymorphism;

public class ObjectDemo {
    int num;
    float gpa;
    ObjectDemo(int num, float gpa){
        this.num = num;
        this.gpa = gpa;
    }
    @Override
    public boolean equals(Object obj){
        return this.num == ((ObjectDemo)obj).num; // we have to typecast it to ObjectDemo cuz it is type of Object
    }


    public static void main(String[] args) {

        ObjectDemo obj1 = new ObjectDemo(48,55.6f);
        ObjectDemo obj2 = new ObjectDemo(48,55.6f);
        // This is an operator, this will check if the two are pointing to the same object or not
        if (obj1 == obj2){
            System.out.println("Object one is euals to Object 2");
        }
        // And this is a method of Object class, This will check the content of two objects are same or not
        if (obj1.equals(obj2)){
            System.out.println("Object one is euals to Object 2");
        }
    }
}
