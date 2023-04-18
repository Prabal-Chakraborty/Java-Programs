package com.Prabal.Object_Oriented_Programming.Introduction;

public class Intro1 {
    public static void main(String[] args) {
        Student prabal = new Student();


//        System.out.println(prabal.rNo); // 0
//        System.out.println(prabal.name); // null
//        System.out.println(prabal.marks); // 0.0
        Student bubun = new Student();

        bubun.greetings();

        Student akash = new Student(45, "Akash Paitandy", 89.5f);
        System.out.println(akash.rNo);
        System.out.println(akash.name);
        System.out.println(akash.marks);

    }
}
class Student{
    int rNo;
    String name;
    float marks;
    void greetings(){
        System.out.println("Hello My Name is "+ this.name);
    }
    // Student riju = new Student(17, "riju", 89.7f);
    // here, this will be replaced with riju
    Student(){
        this.rNo = 38;
        this.name ="Prabal Chakraborty";
        this.marks=92.50f;
    }

    Student(int roll, String name, float marks)
    {
        this.rNo = roll;
        this.name =name;
        this.marks=marks;
    }
}
