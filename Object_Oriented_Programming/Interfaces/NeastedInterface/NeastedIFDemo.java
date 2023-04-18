package com.Prabal.Object_Oriented_Programming.Interfaces.NeastedInterface;

public class NeastedIFDemo {
    public static void main(String[] args) {
        // use a nested interface reference
        A.NeastedIF nif = new B();
        if(nif.isNegative(10)){
            System.out.println("10 is not negative");
        }
        if (nif.isNegative(-12)){
            System.out.println("This can't be displayed");
        }
    }
}

// This class contains a member interface.
class A{
    // this is a nested interface
    public interface NeastedIF{
        public boolean isNegative(int x);
    }
}

// B implements the nested interface.
class B implements A.NeastedIF{
    @Override
    public boolean isNegative(int x) {
        return x < 0;
    }
}
