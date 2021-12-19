package com.Assignments;
import java.lang.Math;
import java.util.Scanner;

public class IsbnNumber {
    public static void main(String[] args){
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); int ans = 0;
        String inp = Integer.toString(num);
        int len = inp.length();

        if (len != 10){
            System.out.println("Please enter exactly 10 digits.");
            System.exit(0);
        }

        for (int i = 0; i < len ; i++) {
            ans = ans + (int) Math.pow(Character.getNumericValue(inp.charAt(i)), len);
        }


        if (ans/11 == 0){
            System.out.println("This is an ISBN Number.");
        }
        else {
            System.out.println("This is NOT an ISBN Number.");
        }
    }
}
