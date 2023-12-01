package Deque;

import java.util.Deque;
import java.util.LinkedList;

// # Deque
//  - Deque stands for double-ended queue, meaning a queue that can operate from the front or back.
//  - If in queue, the operations supported are FIFO, but in deque, it is not only FIFO, but also supports LIFO (Last In First Out).
//  - You could say deque is an implementation of queue and stack data structures.
//
public class DequeApp {
  public static void main(String[] args) {
    Deque<String> stack = new LinkedList<>();

    stack.offerLast("August");
    stack.offerLast("Caprio");
    stack.offerLast("De");

    System.out.println(stack.pollLast());
    System.out.println(stack.pollLast());
    System.out.println(stack.pollLast());

    Deque<String> queue = new LinkedList<>();

    queue.offerFirst("August");
    queue.offerFirst("Caprio");
    queue.offerFirst("De");

    System.out.println(queue.pollFirst());
    System.out.println(queue.pollFirst());
    System.out.println(queue.pollFirst());
  }
}
