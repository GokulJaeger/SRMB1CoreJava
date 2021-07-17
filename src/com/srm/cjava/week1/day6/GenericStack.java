package week1.day6;

import java.util.*;

class stack<T> {

    ArrayList<T> A;
    int top = -1;
    int size;

    stack(int size) {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    void push(T X) {

        if (top + 1 == size) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            if (A.size() > top)
                A.set(top, X);
            else
                A.add(X);
        }
    }

    T top() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else
            return A.get(top);
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else
            top--;
    }

    boolean empty() {
        return top == -1;
    }

    public String toString() {
        String Ans = "";
        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(A.get(i)) + "->";
        }
        Ans += String.valueOf(A.get(top));
        return Ans;
    }
}

public class GenericStack {

    public static void main(String[] args) {
        stack<Integer> stk1 = new stack<>(3);
        stk1.push(8);
        stk1.push(20);
        stk1.push(14);
        System.out.println("stk1 after pushing 3 elements:\n" + stk1);
        stk1.pop();
        System.out.println("stk1 after pop:\n" + stk1);

        stack<String> stk2 = new stack<>(3);
        stk2.push("Naruto");
        stk2.push("Attack On Titans");
        stk2.push("My Hero Academia");
        System.out.println("\nstk2 after pushing 3 elements:\n" + stk2);
        System.out.println("stk2 after pushing 4th element:");
        stk2.push("Dr.Stone");

        stack<Float> stk3 = new stack<>(2);
        stk3.push(60.5f);
        stk3.push(55.6f);
        System.out.println("\nstk3 after pushing 2 elements:\n" + stk3);
        System.out.println("top element of stk3:\n" + stk3.top());
    }
}
