package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// # Queue
//   - Queue is an implementation of the Queue or FIFO (First In First Out) data structure
//
public class QueueApp {
  public static void main(String[] args) {
    // This will automatically grow the array size.
    Queue<String> queue = new ArrayDeque<>();

    // If you want to sort queue, then use this.
    // Queue<String> queue = new PriorityQueue<>();

    // Use it for many data looping operations, this will be faster.
    // Queue<String> queue = new LinkedList<>();

    queue.offer("De");
    queue.offer("Caprio");
    queue.offer("August");

    for(String next = queue.poll(); next != null; next = queue.poll()) {
      System.out.println(next);
    }

    System.out.println(queue.size());
  }
}
