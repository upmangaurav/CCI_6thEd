package com.cci.Ch2SolCode;

public class Two4 {
    public static Node LLPartition(Node head, int x){
        Node temp = head;
        Node smallerLL;
        Node mainLL;

        // If the very first element is smaller
        if(head.num < x){
            smallerLL = new Node(head.num);
            mainLL = head.next;
            temp = temp.next;
        }
        //If not then we look for the first smaller than x element:
        else {
            while (temp.next.num >= x) temp = temp.next;
            smallerLL = new Node(temp.next.num);
            temp.next = temp.next.next;
        }

        Node smallerTemp = smallerLL;

        while(temp.next.next != null){
            if(temp.next.num < x){
                smallerTemp = temp.next;
                temp.next = temp.next.next;

                smallerTemp.next.next = null;
            }
            else{
                temp = temp.next;
            }
        }

        //We are onto the second last node now
        if(temp.next.num < x){
            smallerTemp.next = temp.next;
            temp.next = null;
        }

        smallerTemp.next = head;
        return smallerLL;
    }

    public static void main(String[] args){
        Node first = new Node(6);
        first.addtoLL(6000);
        Node second = first.addtoLL(60);
        first.addtoLL(60000);
        first.addtoLL(first, 600);
        first.addtoLL(600000);
        System.out.println("original list is: ");
        first.printLL(first);

        System.out.println("updated list is: ");
        first.printLL(LLPartition(first, 5000));
    }
}
