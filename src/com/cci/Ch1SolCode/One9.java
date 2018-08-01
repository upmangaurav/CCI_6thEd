package com.cci.Ch1SolCode;

import java.util.Scanner;

public class One9 {
    protected static boolean isSubString(String bigger, String smaller){
        if(bigger == null || smaller == null)	return false;
        if((bigger.indexOf(smaller)) > 0)	return true;
        else return false;

    }
    protected static boolean isRotation(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        return isSubString(str1 + str1, str2);
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(isRotation(str1, str2));

    }
}