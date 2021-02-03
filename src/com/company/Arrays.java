package com.company;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args)
    {
        int []a = {10,20,30,40,50};
        System.out.println(a.length);
        System.out.println(a[0]);
        a[0] = 60;
        System.out.println(a[0]);

        // ------------------------------------

        int arr[][] = {{1,2,3},{4,5,6}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

        // ------------------------------------

        int numItems;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items : ");
        numItems = sc.nextInt();
        int[] array = new int[numItems];
        for(int i=0;i<numItems;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<numItems;i++)
        {
            System.out.print(array[i]+ " ");
        }
    }
}
