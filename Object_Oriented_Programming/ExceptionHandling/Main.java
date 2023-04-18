package com.Prabal.Object_Oriented_Programming.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        try
        {
//            divide(a,b);
            String name = "Prabal";
            if (name.equals("Prabal")){
                       throw new MyException("The name is Prabal Chakraborty !!");
        }

        }catch (MyException h)
        {
            System.out.println(h.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will always execute !!!!!!!!!!");
        }
    }


    static int divide(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Please don't divide by zero");
        }
        return a / b;
    }
}
