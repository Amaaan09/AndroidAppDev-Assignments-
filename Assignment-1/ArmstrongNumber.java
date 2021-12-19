package com.Assignments;
import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String[] args){

        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        String inp = Integer.toString(num);


        for (int i = 0; i < inp.length(); i++){
            ans = (int) (ans + Math.pow(Character.getNumericValue(inp.charAt(i)), inp.length()));
        }

        if (ans == num){
            System.out.println("The number is an Armstrong number!");
        }
        else {
            System.out.println("The number is NOT an Armstrong number!");
        }
    }
}
