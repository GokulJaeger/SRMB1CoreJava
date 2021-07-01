package com.srm.cjava.week2.day9;

import java.util.ArrayDeque;

public class StackArrayDeque {
    public static void main(String[] args) {

       ArrayDeque<Integer> stack = new ArrayDeque<>();

       stack.push(2);
       stack.push(5);
       stack.push(6);
       stack.push(9);
       stack.push(8);
       stack.push(14);
       stack.push(20);


       System.out.println("Current element at the top of the stack: " + stack.peek());

       System.out.println("Element popped from the stack: " + stack.pop());
       System.out.print("Current elements in the stack: ");
       while(!stack.isEmpty()) {
           System.out.print(stack.pop() + " ");
       }

   }
}
