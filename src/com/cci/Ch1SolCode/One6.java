package com.cci.Ch1SolCode;

import java.util.Scanner;

public class One6 {

    private static String strCompress(String str){
        int count = 0;
        int grossCount = 0;
        char ch = str.charAt(0);

        for (int i = 1; i < str.length(); i++){
            if(str.charAt(i) != ch){
                grossCount += count - 1;
                count = 0;
                ch = str.charAt(i);
            }
            else
                count ++;
        }
        grossCount += count - 1;
        if(grossCount <= 0) return str;

        count = 0;
        ch = str.charAt(0);
        String finalStr = "";

        for (int i = 1; i < str.length(); i++){
            if(str.charAt(i) != ch){
                finalStr = finalStr + ch + (count + 1);

                count = 0;
                ch = str.charAt(i);
            }
            else
                count ++;
        }
        finalStr = finalStr + ch + (count + 1);
        return finalStr;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(strCompress(str));
    }
}