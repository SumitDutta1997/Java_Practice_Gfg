package com.company;

public class TypeConversion {

    public static void main(String[] args)
    {
        int x = 10;    //Implicit Conversion
        long y = x;
        float z = y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        double d = 65.4;   //Explicit Conversion
        int i = (int)d;
        char c = (char)i;
        System.out.println(d);
        System.out.println(i);
        System.out.println(c);
    }
}
