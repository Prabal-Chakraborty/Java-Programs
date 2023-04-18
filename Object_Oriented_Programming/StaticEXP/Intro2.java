package com.Prabal.Object_Oriented_Programming.StaticEXP;

public class Intro2 {
    public static void main(String[] args) {
        Student s1 = new Student();
//        System.out.println(s1); // o/p----> This is the empty Constructor
        Student s2 = new Student(38,"Prabal Chakraborty",95.5f);
//        System.out.println(s2); // o/p----> This is the  Constructor with 3 parameters
//
//        s2.changeName("BUBUN");
//        s1.greetings();
       // Consturtor overloading
        Student s3 = new Student(s2);
        System.out.println(s3.marks);
        System.out.println(s3.name);

    }

}
class Student {
    int rNO;
    String name;
    float marks;


//    Student(){
//        System.out.println("This is the empty Constructor");
//    }

    void changeName(String nam){
        this.name = nam;
    }
    void greetings(){
        System.out.println("Hello My Name Is "+ this.name);
    }
    // we can call one constructor with other Constructor
    // Constructor Overloading
    Student(Student other){
        this.rNO = other.rNO;
        this.name = other.name;
        this.marks= other.marks;

    }

    Student () {
        this.rNO = 38;
        this.name = "Prabal ";
        this.marks= 99.09f;
    }

    Student(int roll, String nam, float marks){
//        System.out.println("This is the  Constructor with 3 parameters");
        this.rNO = roll;
        this.name=nam;
        this.marks=marks;
    }
}
