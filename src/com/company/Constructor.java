package com.company;

public class Constructor {

    public static void main(String[] args)
    {
        Points p = new Points(10,20);
        p.print();
    }
}

class Points {
    int x , y;
    Points(int a , int b)
    {
        x = a;
        y = b;
    }
    void print()
    {
        System.out.println("x = "+x+" , y = "+y);
    }
}
