package com.Assignments;
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args){
        // Neon Number
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sq = num * num;
        int ans = 0;
        String inp = Integer.toString(sq);

        for (int i = 0; i < inp.length(); i++){
            ans = ans + Character.getNumericValue(inp.charAt(i));
        }

        if (num == ans) {
            System.out.println("It is a Neon Number.");
        }
        else {
            System.out.println("It is NOT a Neon Number.");
        }
    }

}
