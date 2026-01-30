package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        Queue<Integer> reversed = new LinkedList<>();

        while (!queue.isEmpty()) {
            int element = queue.remove();
            reversed.add(element);
        }

        while (!reversed.isEmpty()) {
            queue.add(reversed.remove());
        }

        System.out.println("Reversed Queue: " + queue);
    }
}

