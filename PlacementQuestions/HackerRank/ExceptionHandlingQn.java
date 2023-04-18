package com.Prabal.PlacementQuestions.HackerRank;


import java.io.*;
        import java.util.*;

public class ExceptionHandlingQn {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        try{
            int x = ip.nextInt();
            int y = ip.nextInt();
            System.out.println(x/y);
        }catch(InputMismatchException e) {
            // ensure that "java.util.InputMismatchException" is printed only.
            System.out.println(e.getClass().toString().replaceFirst("class ", ""));
        }
        catch(ArithmeticException e) {

            System.out.println(e);
        }
        ip.close();
    }
}
