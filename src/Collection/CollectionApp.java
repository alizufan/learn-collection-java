package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// # Collection
//   - Apart from the Iterable interface,
//     the parent class of all collections in Java is Collection.
//   - If the Iterable interface is used as a contract to iterated data sequentially.
//   - Collection is a contract for manipulating collection data,
//     such as adding, deleting and checking the contents of the data collection.
//   - There is no direct implementation for Collection
//     because a collection will be further divided into List, Set and Queue.
//
public class CollectionApp {
  public static void main(String[] args) {

    Collection<String> collection = new ArrayList<>();
    collection.add("August");
    collection.add("De");
    collection.add("Capri");
    collection.addAll(List.of( "June", "Te", "Nyanyo"));

    System.out.println("# Show Collection Item");
    for(var value: collection) {
      System.out.println(value);
    }

    System.out.println("\n# Remove Collection Item");

    collection.remove("De");
    collection.remove("Te");
    collection.removeAll(List.of("Capri", "Nyanyo"));

    for(var value: collection) {
      System.out.println(value);
    }

    System.out.println("\n# Check Collection Item");

    System.out.println("Contains: " + collection.contains("August"));
    System.out.println("Contains: " + collection.contains("Nyanyo"));

    // Note:
    // 'containsAll' will output true when all data elements in the input list are present.
    // If one of the data elements in the input list does not exist, it will output false.
    System.out.println("Contains All: " + collection.containsAll(List.of("De", "Te")));

    System.out.println("Size of Collection: " + collection.size());
  }
}
