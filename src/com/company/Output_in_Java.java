package com.company;

public class Output_in_Java {

    public static void main(String[] args)
    {
        int x = 10, y =20;
        char z = 'M';
        String str = "gfg";
        System.out.println(x);
        System.out.println(x+y);
        System.out.println(x+" "+y);
        System.out.print(str+" ");
        System.out.println("Courses");
        System.out.print("\n");

        int a = 100 , b = 200;
        System.out.format("Value of a is %d \n",a);
        System.out.format("Value of b is %d \n",b);
        float c = (float)Math.PI;
        System.out.println(c);
        System.out.format("Value of PI is:%.2f \n",c);
        System.out.format("Value of PI is:%5.2f \n",c);
        System.out.format("Value of PI is:%05.2f \n",c);
        System.out.printf("a = %d , b = %d",a,b);
    }
}
