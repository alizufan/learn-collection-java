package IterableAndIterator;

import java.util.List;

// # Iterable Interface
//   - Iterable is the parent for all collections in Java, except Map.
//   - Iterable itself is very simple, only used to support for-each loop.
//   - Because all collections must be implemented iterable,
//     automatically all collections in Java support for-each loop,
//     so not just Arrays.
//
public class IterableApp {
  public static void main(String[] args) {

    Iterable<String> names = List.of("August", "De", "Capri");

    for(var name: names) {
      System.out.println(name);
    }

  }
}
