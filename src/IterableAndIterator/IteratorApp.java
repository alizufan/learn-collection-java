package IterableAndIterator;

import java.util.Iterator;
import java.util.List;

// # Iterator Interface
//   - There is no magic in Java,
//     actually for-each in Iterable can happen
//     because there is an iterator() method which returns an Iterator object.
//   - Iterator is an interface that defines how
//     we access elements in a collection sequentially.
//   - For-each itself has appeared since Java 5,
//     before Java 5, to iterate a collection,
//     it was usually done manually using an Iterator object.
//
// # Note
//   Actually, this Iterator is a manual function is 'Iterable'.
public class IteratorApp {
  public static void main(String[] args) {

    Iterable<String> names = List.of("Capri", "De", "August");
    Iterator<String> iterator = names.iterator();

    while(iterator.hasNext()) {
      String name = iterator.next();
      System.out.println(name);
    }

  }
}
