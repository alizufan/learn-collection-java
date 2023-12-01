package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// # Set
//   - A set is a collection that contains unique elements,
//     or cannot be duplicates.
//   - Sets do not have indexes like Lists,
//     therefore, there is no guarantee that the data in
//     the Set will be sorted according to
//     the time we enter the data into the Set.
//   - Set does not have any new methods,
//     so it only uses the methods in its parent interface,
//     namely Collection and Iterable.
//   - Because it doesn't have an index,
//     to retrieve the data in the 'Set',
//     we also have to iterate one by one.
//
// # HashSet vs LinkedHashSet
//   - Behind HashSet and LinkedHashSet there is actually a hash table,
//     where data is stored in a hash table by calculating the hashCode() function.
//   - The difference is, HashSet does not guarantee the data is sorted according to
//     the time we add the data, whereas LinkedHashSet guarantees
//     the data is sorted according to the time we add the data.
//   - The order of data in LinkedHashSet can be maintained because behind it,
//     it uses a double linked list.
//
// # EnumSet
//   - EnumSet is a Set whose data elements must be Enum.
//   - Because Enum data is unique,
//     it is very suitable to use Set rather than List.
//
public class SetApp {
  public static void main(String[] args) {

    // # Note
    // - Remove duplicate item
    //
    Set<String> names = new HashSet<>();


    // # Note
    // - Remove duplicate item
    //
    // Set<String> names = new LinkedHashSet<>();

    names.add("August");
    names.add("De");
    names.add("Caprio");
    names.add("August");
    names.add("De");
    names.add("Caprio");

    for (var name : names) {
      System.out.println(name);
    }
  }
}
