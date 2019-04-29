package com.stackroute;

import java.util.Scanner;

public class Capital {
    public static void main(String[] args)
    {
        int i=0;
        Scanner str = new Scanner(System.in);
        System.out.println("Enter a character : ");
        String s1 = str.nextLine();
        char ch=s1.charAt(i);
        if (ch>=65 && ch<=90)
            System.out.println("Character is a capital letter");
        else if (ch>=97 && ch<=122)
            System.out.println("Character is a small letter");
        else if (ch>=48 && ch<=57)
            System.out.println("Character is a digit");
        else
            System.out.println("Character is a Special Character");

    }
}
