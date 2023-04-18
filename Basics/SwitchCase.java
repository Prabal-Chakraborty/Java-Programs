package com.Prabal.Basics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        char ch = 'P';
        switch (ch){
            case 'A' :
                System.out.println("Vowel");
                break;
            case 'E' :
                System.out.println("Vowel");
                break;
            case 'I' :
                System.out.println("Vowel");
                break;
            case 'O' :
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
        System.out.println("This one is for Switch case");
        System.out.println("Enter a number ");
        int n = p.nextInt();
        switch (n){
            case 1 :
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("This one if for if statement");
        System.out.println("Enter a number ");
        int m = p.nextInt();
        if(m==1){
            System.out.println("Mon");
        } else if (m==2) {
            System.out.println("Tue");
        }
        else if(m==3){
            System.out.println("wed");
        } else if (m==4) {
            System.out.println("THu");
        } else if (m==5) {
            System.out.println("fri");
        } else if (m==6) {
            System.out.println("sat");
        } else if (m==7) {
            System.out.println("sun");
        }
        else {
            System.out.println("Invalid day");
        }
    }

}
