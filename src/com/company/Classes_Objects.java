package com.company;

public class Classes_Objects {

    public static void main(String[] args)
    {
        complex c1 = new complex(10, 20);
        c1.print();
        complex c2 = new complex(20, 30);
        c1.add(c2);
        c1.print();
    }
}

class complex {
    int real , imag;
    complex(int r, int i)
    {
        real = r;
        imag = i;
    }
    void print()
    {
        System.out.println(real + "+i" + imag);
    }
    void add(complex c)
    {
        real = real + c.real;
        imag = imag + c.imag;
    }
}
