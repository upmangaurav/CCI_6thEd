package com.cci.Ch2SolCode;

public class Two5 {
    public static int getDigit(Node head){
        int counter = 0;
        int sum = 0;
        while(head != null){
            sum += head.num * Math.pow(10, counter);
            head = head.next;
            counter++;
        }
        return sum;
    }

    public static void main(String[] Args){
        Node first = new Node(6);
        first.addtoLL(7);
        first.addtoLL(8);
        first.addtoLL(9);

        Node Second = new Node(4);
        Second.addtoLL(2);
        Second.addtoLL(1);
        System.out.println("Sum of the 2 lists is: " + (getDigit(first) + getDigit(Second)));
    }
}
