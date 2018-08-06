package com.cci.Ch3SolCode;

import java.util.Stack;

class qby2Stacks{
    Stack<Integer> st1, st2;
    boolean tracker; // To keep track of the last call(true for pop)

    public qby2Stacks(){
        st1 = new Stack<>();
        st2 = new Stack<>();
        tracker = false;
    }
    public void push(int num){
        if(tracker){
            while (!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
        tracker = false;
        st1.push(num);
    }
    public int pop(){
        if(!tracker){
            while (!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        tracker = true;
        return st2.pop();
    }
}

public class Three4 {
    public static void main(String Args[]){
        qby2Stacks myq = new qby2Stacks();
        myq.push(10);
        myq.push(100);
        myq.push(1000);

        System.out.println(myq.pop());
        myq.push(10000);
        System.out.println(myq.pop());
        System.out.println(myq.pop());
        myq.push(100000);
        myq.push(1000000);
        System.out.println(myq.pop());
        System.out.println(myq.pop());
    }
}
