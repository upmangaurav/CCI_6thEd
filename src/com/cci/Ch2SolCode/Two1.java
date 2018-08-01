package com.cci.Ch2SolCode;

import java.util.HashMap;
import java.util.Map;

class Node{
    int num;
    Node next;

    public Node(int n){
        num = n;
        next = null;
    }

    public Node addtoLL(int num){
        Node temp = this;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(num);
        temp.next = newNode;
        return newNode;
    }

    public Node addtoLL(Node node, int num){
        while(node.next != null){
            node = node.next;
        }
        Node newNode = new Node(num);
        node.next = newNode;
        return newNode;
    }

    public Node deletefromLL(Node node, int n){
        Node temp = node;
        if(temp.num == n) {
            return temp.next;
        }

        while(temp.next != null){
            if(temp.next.num == n) {
                temp.next = temp.next.next;
                return node;
            }
            temp = temp.next;
        }
        return node;
    }

    public void printLL(Node head){
        while (head != null){
            System.out.println(head.num);
            head = head.next;
        }
    }
}

public class Two1 {
    public static void deDup1(Node head) {
        Node temp = head;
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(temp.num, true);

        while (temp.next != null) {
            if (map.containsKey(temp.next.num)) {
                temp.next = temp.next.next;
            } else {
                map.put(temp.num, true);
                temp = temp.next;
            }
        }
    }
    
        public static void main(String[]  Args){
        Node first = new Node(6);
        Node second = first.addtoLL(60);
        first.addtoLL(first, 600);
        first.printLL(first);
        first.deletefromLL(second, 600);
        first.addtoLL(6000);
        first.addtoLL(60);
        first.printLL(first);

        deDup1(first);
        first.printLL(first);

    }


}

