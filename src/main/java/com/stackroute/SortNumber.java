package com.stackroute;

import java.util.Scanner;

public class SortNumber {

    public static void main(String args[]) {
        int sum=0;

        System.out.println("enter the number");

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []a=new int[n];
        System.out.println("enter the number");

        for(int i=0;i<=n-1;i++)
        {

            a[i]=scn.nextInt();
            sum=sum+a[i];

        }
        System.out.println("sum of the number" +sum);
    }

}