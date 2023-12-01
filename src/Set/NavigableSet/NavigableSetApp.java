package Set.NavigableSet;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

// # Navigable Set
//  - 'Set.NavigableSet' is an instance of 'Set.SortedSet'.
//  - 'Set.NavigableSet' adds methods for navigating element searches,
//     such as searching for elements that are greater than,
//     less than, reversing the order of the set, etc.
//
// # Method Immutable 'Set.NavigableSet'
//  -----------------------------------------------------------------------------------------------
//  | Method                                    | Description                                     |
//  -----------------------------------------------------------------------------------------------
//  | Collections.emptyNavigableSet()           | Create an empty immutable navigable set.        |
//  | Collections.unmodifiableNavigableSet(set) | Change the mutable navigable set to immutable.  |
//  -----------------------------------------------------------------------------------------------
//
public class NavigableSetApp {
  public static void main(String[] args) {
    // # Note
    // 'Set.NavigableSet' is great when we have the possibility to change
    // the retrieval state of the elements we need.
    //
    NavigableSet<String> names = new TreeSet<>();
    names.addAll(Set.of("De", "August", "Caprio", "Now"));

    NavigableSet<String> namesReverse = names.descendingSet();
    NavigableSet<String> namesHead = names.headSet("Caprio", true);
    // Set.NavigableSet<String> namesTail = names.tailSet("ZigZag", true);

    System.out.println("# names ascending");
    for (var name : names) {
      System.out.println(name);
    }

    System.out.println("\n# names descending");
    for (var name : namesReverse) {
      System.out.println(name);
    }

    System.out.println("\n# names head to element");
    for (var name : namesHead) {
      System.out.println(name);
    }

    // # Immutable Set
    NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
    // error
    // immutable.add("Oh no");
  }
}
