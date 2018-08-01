package com.cci.Ch1SolCode;
import java.util.*;

public class One1 {

    private static boolean unique_chars(String str){
        Set<Character> charSet = new HashSet<>();
        for (Character ch : str.toCharArray()){
            charSet.add(ch);
        }
        return (charSet.size() == str.length()) ? true : false;

    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(unique_chars(str));

    }
}