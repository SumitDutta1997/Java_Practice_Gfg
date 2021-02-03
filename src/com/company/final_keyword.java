package com.company;

public class final_keyword {

    public static void main(String[] args)
    {
        final int x;  // No Re-Initialization
        x=100;
        System.out.println(x);
    }
}

class Base {
    void fun()
    {
        System.out.println("Base");
    }
}
class Derived extends Base {
    void fun()
    {
        System.out.println("Derived");  // No method overriding
    }
}

