package com.stackroute;

import java.util.Scanner;

public class Tom {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if((num > 20)&&(num < 30))
        {
            if(num%2==0)
            {
                System.out.println("Tom");
            } else
            {
                System.out.println("jerry");
            }


        }
    }
}