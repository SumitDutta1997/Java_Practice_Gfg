package com.company;

public class Functions_in_Java {

    public static void main(String[] args)
    {
        System.out.println("Main() begins");
        fun1();
        System.out.println("Main() ends");

        int x=5,y=10;
        System.out.println(getMax(x,y));

        int a=5;
        check(a);
        System.out.println(a);

        Point p = new Point();
        p.x = 5; p.y = 10;
        change(p);
        System.out.println(p.x+ " "+p.y);
    }
    public static void fun1()
    {
        System.out.println("fun1() begins");
        fun2();
        System.out.println("fun1() ends");
    }
    public static void fun2()
    {
        System.out.println("Inside fun2()");
    }
    public static int getMax(int x , int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    public static void check(int a)
    {
        a = a+5;
    }
    public static void change(Point p)
    {
        p.x = 20;
        p.y = 20;
    }
}
