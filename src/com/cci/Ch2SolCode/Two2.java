package com.cci.Ch2SolCode;

public class Two2 {

    public static void main(String[] Args){

        Node first = new Node(6);
        Node second = first.addtoLL(60);
        first.addtoLL(first, 600);
        first.deletefromLL(second, 600);
        first.addtoLL(6000);
        first.addtoLL(60000);
        first.addtoLL(600000);
        first.printLL(first);

        System.out.println("2nd from Last: " + kth2Last(first, 2));
    }

    public static int kth2Last(Node node, int k){
        Node head = node;
        int count = 1;
        while(head.next != null){
            head = head.next;
            count ++;
        }

        System.out.println(count);

        if(count < k || k < 1) {
            System.out.println("Invalid k index!");
            return -1;
        }

        Node node1 = node;
        for(int i = 0; i < count - k; i++){
            System.out.println("i is: " + i);
            node1 = node1.next;
        }
        return node1.num;
    }
}
