package com.company;

public class Autoboxing_and_AutoUnboxing {

    public static void main(String[] args)
    {

        int x1 = 10;
        Integer x2 = x1;
        int x3 = x2;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        Integer z1 = 400 , z2 = 400;
        if(z1==z2)
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}
