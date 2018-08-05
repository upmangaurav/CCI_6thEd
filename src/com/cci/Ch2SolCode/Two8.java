package com.cci.Ch2SolCode;

public class Two8 {
    public static boolean detectLoop(Node head){
        Node slower = head.next;
        Node faster = head.next.next;
        while (faster != null){
            if(faster == slower) return true;

            if(faster.next.next != null && faster.next != null) {
                faster = faster.next.next;
                slower = slower.next;
            }
        }
        return false;
    }


    public static Node detectLoopStPt(Node head){
        Node slower = head.next;
        Node faster = head.next.next;

        if(!detectLoop(head)) {
            System.out.println("Loop not found!");
            return null;
        }

        while(slower != faster){
            faster = faster.next.next;
            slower = slower.next;
        }

        slower = head;

        while(slower != faster){
            slower = slower.next;
            faster = faster.next;
        }

        return slower;
    }

    public static void main(String Args[]){
        Node first = new Node(6);
        first.addtoLL(60);
        Node third = first.addtoLL(first, 600);
        first.addtoLL(6000);
        first.addtoLL(600000);
        first.addtoLL(6000000);
        Node fifth = first.addtoLL(100);

        first.printLL(first);
        fifth.next = third;

        System.out.println(detectLoop(first));
        System.out.println(detectLoopStPt(first).num);
    }
}
