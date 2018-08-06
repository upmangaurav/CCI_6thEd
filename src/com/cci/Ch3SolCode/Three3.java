package com.cci.Ch3SolCode;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

class SetOfStacks{
    private static int capacity;
    int totalSize;

    List<Stack<Integer>> stackList = new ArrayList<>();

    public SetOfStacks(int cap){
        if(cap > 0){
            capacity = cap;
            totalSize = 0;
            Stack<Integer> st = new Stack<>();
            stackList.add(st);
        }
        else
            throw new ArithmeticException("Threshold size must be >0");
    }
    public void push(int item){
        if(stackList.get(stackList.size() - 1).size() < capacity){
            stackList.get(stackList.size() - 1).add(item);
        }
        else{
            Stack<Integer> st = new Stack<>();
            st.add(item);
            stackList.add(st);
        }
        totalSize++;
    }
    public int pop(){
        int returnee = Integer.MAX_VALUE;
        try{
            if(totalSize == 0) throw new EmptyStackException();

            else {
                returnee = stackList.get(stackList.size() - 1).pop();
                totalSize--;

                //Check if the top element was the last one in that stack
                if(stackList.get(stackList.size() - 1).size() == 0) {
                    stackList.remove(stackList.get(stackList.size() - 1));
                }
            }
        }
        catch (EmptyStackException ex){
            System.out.println("Empty Stack. Push something first ffs!");
        }
        return returnee;
    }
}
public class Three3 {
    public static void main(String Args[]){
        SetOfStacks ss = new SetOfStacks(1);
        ss.push(1);
        ss.push(10);
        ss.push(100);
        ss.push(1000);
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());
    }

}
