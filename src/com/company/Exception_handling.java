package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args)
    {
        try {
            Scanner sc = new Scanner(new File("test.sc"));
            System.out.println("Exit main()");
        }
        catch(FileNotFoundException ex) {
            System.out.println("File not found caught...");
        }
        finally {
            System.out.println("Finally block executes regardless...");
        }
        System.out.println("After try-catch-finally, life goes on...");

        // -----------------------------------------------------------

        int a,b,sum;
        Scanner sc = new Scanner(System.in);
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            sum=a+b;
            System.out.println(sum);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Insufficient no of parameters.");
        }

        // -----------------------------------------------------------

        try {
            methodA();
            System.out.println("Exit main()");
        }
        catch(ArithmeticException ex) {
            System.out.println("Arithmetic Exception caught");
            ex.printStackTrace();
        }

        methodB();
    }
    public static void methodA()
    {
        int a=10 , b=0;
        int c = a/b;
        System.out.println(c);
    }

    public static void methodB() throws ArithmeticException
    {
        int a=5, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numeric value for value b : ");
        int b = scan.nextInt();
        if(b==0)
            throw new ArithmeticException();
        else {
            c = a / b;
            System.out.println("Value of c is : "+c);
        }
        System.out.println("Exit methodB()");
    }
}
