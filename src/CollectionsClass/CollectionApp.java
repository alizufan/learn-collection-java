package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// # Collection Clas
//   - Collections is a class that contains utility
//     static methods to help us use Java 'Collection'.
//   - In previous materials we have discussed several things,
//     such as creating immutable collections for example.
//   - But actually there are still many static
//     methods that we can use in the 'Collections' class
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Collections.html.
//
public class CollectionApp {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.addAll(List.of("August", "De",  "Caprio", "Magma", "Eliano"));
    System.out.println("# print collection list");
    for (var value: list) {
      System.out.println(value);
    }

    System.out.println("\n# print reverse collection list");
    Collections.reverse(list);
    for (var value: list) {
      System.out.println(value);
    }

    System.out.println("\n# print shuffle collection list");
    Collections.shuffle(list);
    for (var value: list) {
      System.out.println(value);
    }
  }
}
