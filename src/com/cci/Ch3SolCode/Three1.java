package com.cci.Ch3SolCode;

import java.util.EmptyStackException;

class StackNode{
    int num;
    StackNode next;

    public StackNode(int n){
        num = n;
        next = null;
    }

    public StackNode addtoLL(int num){
        StackNode temp = this;
        while(temp.next != null){
            temp = temp.next;
        }
        StackNode newStackNode = new StackNode(num);
        temp.next = newStackNode;
        return newStackNode;
    }

    public StackNode addtoLL(StackNode StackNode, int num){
        while(StackNode.next != null){
            StackNode = StackNode.next;
        }
        StackNode newStackNode = new StackNode(num);
        StackNode.next = newStackNode;
        return newStackNode;
    }

    public StackNode deletefromLL(StackNode StackNode, int n){
        StackNode temp = StackNode;
        if(temp.num == n) {
            return temp.next;
        }

        while(temp.next != null){
            if(temp.next.num == n) {
                temp.next = temp.next.next;
                return StackNode;
            }
            temp = temp.next;
        }
        return StackNode;
    }

    public void printLL(StackNode head){
        while (head != null){
            System.out.println(head.num);
            head = head.next;
        }
    }
}


public class Three1 {
    static class stackArr3 {
        int[] arr;
        int index1, index2, index3;
        int cap1, cap2, cap3;

        public stackArr3(int size) {
            try {
                if(size < 3) throw new ArrayStoreException(" Size must be >3 ");

                arr = new int[size];

                index1 = -1;
                cap1 = size/3 - 1;

                index2 = size/3 - 1;
                cap2 = 2*size/3 - 1;

                index3 = 2*size/3 - 1;
                cap3 = size - 1;
            }
            catch (ArrayStoreException e){
                System.out.println(e);
            }
        }

        void push(int num, int stack_no_1_or_2_or_3){
            try{
                switch(stack_no_1_or_2_or_3) {
                    case 1:
                        if(index1 != cap1) {
                            arr[++index1] = num;
                        }
                        else
                            throw new StackOverflowError("Stack #1 is at full capacity. Please pop an item first!");
                        break;
                    case 2:
                        if(index2 != cap2) {
                            arr[++index2] = num;
                        }
                        else
                            throw new StackOverflowError("Stack #2 is at full capacity. Please pop an item first!");
                        break;
                    case 3:
                        if(index3 != cap3) {
                            arr[++index3] = num;
                        }
                        else
                            throw new StackOverflowError("Stack #3 is at full capacity. Please pop an item first!");
                        break;
                }
            }catch (StackOverflowError ex){
                System.out.println(ex);
            }
            printStackArr();
        }

        int pop(int stack_no_1_or_2_or_3){
            int returnee = -1;
            try{
                switch(stack_no_1_or_2_or_3) {
                    case 1:
                        if(index1 != -1) {
                            returnee = arr[index1];
                            arr[index1--] = 0;
                        }
                        else {
                            System.out.println("Stack #1 is Empty. Try push first!");
                            throw new EmptyStackException();
                        }
                        break;
                    case 2:
                        if(index2 != arr.length/3 - 1) {
                            returnee = arr[index2];
                            arr[index2--] = 0;
                        }
                        else {
                            System.out.println("Stack #2 is Empty. Try push first!");
                            throw new EmptyStackException();
                        }
                        break;
                    case 3:
                        if(index3 != 2*arr.length/3 - 1) {
                            returnee = arr[index3];
                            arr[index3--] = 0;
                        }
                        else {
                            System.out.println("Stack #3 is Empty. Try push first!");
                            throw new EmptyStackException();
                        }
                        break;
                    default:
                        System.out.println("Enter a number between 1-3: ");
                }
            }
            catch (StackOverflowError ex){
                System.out.println(ex);
            }
            printStackArr();
            return returnee;
        }
        public void printStackArr(){
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] Args){
        stackArr3 stackFromArray = new stackArr3(10);
        stackFromArray.push(10, 1);
        stackFromArray.push(100, 1);
        stackFromArray.push(1000, 1);

        stackFromArray.push(20, 2);
        stackFromArray.push(200, 2);
        stackFromArray.push(2000, 2);

        stackFromArray.pop(2);
        stackFromArray.pop(2);
        stackFromArray.pop(2);
        stackFromArray.pop(2);

        System.out.println(stackFromArray.pop(1));
        System.out.println(stackFromArray.pop(2));
    }
}
