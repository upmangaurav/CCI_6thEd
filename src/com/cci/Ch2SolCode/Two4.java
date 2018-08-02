package com.cci.Ch2SolCode;

public class Two4 {
    public static Node LLPartition(Node head, int x){
        Node temp = head;
        Node smallerLL = null;

        if(head.num < x){
            smallerLL = new Node(head.num);
            head = head.next;
        }
        else {
            while (temp.next.num >= x) temp = temp.next;
            smallerLL = new Node(temp.next.num);
            temp.next = temp.next.next;
        }

        Node smallerTemp = smallerLL;

        while(temp.next.next != null){
            if(temp.next.num < x){
                smallerTemp.next = temp.next;
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }

        //We are onto the second last node
        if(temp.next.num < x){
            smallerTemp.next = temp.next;
            temp.next = null;
        }

        smallerTemp.next = head;
        return smallerLL;
    }

    public static void main(String[] args){
        Node first = new Node(6);
        Node second = first.addtoLL(60);
        first.addtoLL(first, 600);
        first.deletefromLL(second, 600);
        first.addtoLL(6000);
        first.addtoLL(60000);
        first.addtoLL(600000);
        first.printLL(first);

        first.printLL(LLPartition(first, 5000));
    }
}
