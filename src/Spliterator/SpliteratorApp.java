package Spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

// # Spliterator
//   - Spliterator is an interface that can be used to partition data collections.
//   - Usually this is used when we want to process a large collection, then to make it faster,
//     split it into several and process it in parallel to make it faster.
//   - The use of Spliterator is usually closely related to Java Thread or Java Concurrency,
//     but in this material we will not discuss that, focus more on Spliterator.
//
public class SpliteratorApp {
  public static void main(String[] args) {
    List<String> list = List.of("August", "De", "Caprio", "Antonio", "Laira", "Delopes");

    // # Note:
    // This is very suitable if you want to process large data, and you can process it in parallel.
    Spliterator<String> spliterator1 = list.spliterator();
    Spliterator<String> spliterator2 = spliterator1.trySplit();
    Spliterator<String> spliterator3 = spliterator2.trySplit();

    System.out.println("\n # Spliterator Estimate Size Section");
    System.out.println(spliterator1.estimateSize());
    System.out.println(spliterator2.estimateSize());
    System.out.println(spliterator3.estimateSize());

    System.out.println("\n # Spliterator Section 1");
    spliterator1.forEachRemaining(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });

    System.out.println("\n # Spliterator Section 2");
    spliterator2.forEachRemaining(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });

    System.out.println("\n # Spliterator Section 3");
    spliterator3.forEachRemaining(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });
  }
}
