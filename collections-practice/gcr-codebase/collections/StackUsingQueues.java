package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    static int pop() {
        return q1.remove();
    }

    static int top() {
        return q1.peek();
    }

    public static void main(String[] args) {

        push(1);
        push(2);
        push(3);

        System.out.println("Pop: " + pop());
    }
}

