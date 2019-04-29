package com.stackroute;

import java.util.Scanner;

public class GuessGame {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scn.nextInt();

        while (true) {
            System.out.println("please guess the number between 1 to 50");
            int num1 = scn.nextInt();
            if (num1 < num) {

                System.out.println("Number guessed is less than original number");
            }
            else if (num1 > num) {
                System.out.println("Number guessed is more than original number");
            }
            else {
                System.out.println("Number guessed matches the original number");
                break; }

        }
    }
}