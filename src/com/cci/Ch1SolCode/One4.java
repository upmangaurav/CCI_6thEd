package com.cci.Ch1SolCode;

import java.util.Scanner;

public class One4 {

    private static boolean perm_palindrome(String str){
        str = str.toLowerCase();
        int [] charUniv = new int[128];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            charUniv[str.charAt(i)] += 1;
            if (str.charAt(i) != 32) count++;
        }
//        for(int i = 0; i < charUniv.length - 1; i++){
//            if(charUniv[i] == 0) continue;
//            System.out.print("  For i = " + i + ", Count = " + charUniv[i]);
//        }

        int oddOccurencesCount = 0;
        for (int i = 0; i < charUniv.length; i++){
            if(i == 32) continue;
            else if(charUniv[i] == 0) continue;

            if(charUniv[i] % 2 == 1) oddOccurencesCount ++;
        }

        if(count % 2 == 0){
            if(oddOccurencesCount != 0) return false;
        }
        else{
            if(oddOccurencesCount != 1) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(perm_palindrome(str)? "True" : "False");

    }
}