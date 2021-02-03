package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input_in_Java {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string : ");
        String s = br.readLine();
        System.out.println("You entered : "+s);
        System.out.println("Enter an Integer : ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("You entered : "+x);

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Your entered string: "+str);
        int y = sc.nextInt();
        System.out.println("You entered integer: "+y);
        float f = sc.nextFloat();
        System.out.println("You entered float: "+f);
    }
}
