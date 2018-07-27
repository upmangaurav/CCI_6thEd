package com.cci.solcode;
import java.io.*;
import java.util.*;

public class One5 {

    private static boolean string_perms(String str1, String str2){
        //Swapping mechanism - consumes extra space
//        if(str2.length() > str1.length()){
//            String str = str2;
//            str2 = str1;
//            str1 = str;
//        }

        if(str1.length() - str2.length() > 1) return false;

        int j = 0;
        int distance = 0;
        for(int i = 0; i < str2.length(); i++){
            if(str2.charAt(i) != str1.charAt(j)){
                if(distance ==0){
                    // edit case
                    if(str2.charAt(i + 1) != str1.charAt(j + 1))
                    j ++;

                    distance ++;
                }
                else
                    return false;
            }
            j++;
        }
        return true;
    }


    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if(str1.length() >= str2.length())
            System.out.println(string_perms(str1, str2));
        else
            System.out.println(string_perms(str2, str1));
    }
}