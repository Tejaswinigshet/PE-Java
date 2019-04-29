package com.stackroute;

import java.util.Scanner;



public class Character {

    public static void main(String[] arg) {
        int i = 0, n;
        Scanner str = new Scanner(System.in);
        System.out.println("Enter a character : ");
        String s1 = str.nextLine();
        int len = s1.length();
        for (i = 0; i < len; i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                System.out.println("Vowel");
            }
            else
            {
                System.out.println("Consonent");

            }
            {

            }
        }
    }
}


