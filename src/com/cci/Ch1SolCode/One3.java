package com.cci.Ch1SolCode;

import java.util.Scanner;

public class One3 {

    private static char[] urlify(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ')
                count ++;
        }
        char [] charArr = new char[(str.length() + 2*count)];
        int j = charArr.length - 1;

        for (int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == ' '){
                charArr[j] = '0';
                charArr[j - 1] = '2';
                charArr[j - 2] = '%';
                j -= 3;
            }
            else {
                charArr[j] = str.charAt(i);
                j--;
            }
                count ++;
        }
        return charArr;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(urlify(str));

    }
}