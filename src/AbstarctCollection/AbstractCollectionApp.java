package AbstarctCollection;

import java.util.Queue;

// # Abstract Collection
//   - Collection data structures in Java are always evolving,
//     but usually the basic algorithm is always the same between collection types.
//   - Almost all collection interfaces in Java have an abstract class
//     provided as the basis for the algorithm, and almost all concrete class
//     implementations always extend an abstract class collection.
//   - This makes it easier for us, if we want to create a collection manually,
//     we don't need to create it from scratch,
//     we can use the abstract class that has been provided.
//
public class AbstractCollectionApp {
  public static void main(String[] args) {
    Queue<String> queue = new SingleQueue<>();
    System.out.println(queue.size());

    System.out.println(queue.offer("August"));
    System.out.println(queue.offer("De"));
    System.out.println(queue.offer("Caprio"));

    System.out.println(queue.size());
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.size());
  }
}
