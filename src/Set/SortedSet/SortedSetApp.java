package Set.SortedSet;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

// # Sorted Set
//  - 'Set.SortedSet' is a derivative of Set,
//    but in 'Set.SortedSet' the elements entered into
//    the 'Set.SortedSet' will be automatically sorted.
//  - If the element is an instance of the 'Comparable' interface,
//    it will automatically be sorted using the comparable.
//  - If the element is not an instance of the 'Comparable' interface,
//    then we can use the Comparator to tell
//    the 'Set.SortedSet' how to sort its elements.
//
// # Create Immutable Sorted Set
// --------------------------------------------------------------------------------------
// | Method                                 | Description                               |
// --------------------------------------------------------------------------------------
// | Collections.emptySortedSet()           | Creates an empty immutable sorted set.    |
// | Collections.unmodifiableSortedSet(set) | Converts mutable sorted set to immutable. |
// --------------------------------------------------------------------------------------
//
public class SortedSetApp {
  public static void main(String[] args) {
    // ascending
    SortedSet<Person> people = new TreeSet<>(new PersonComparator());

    // descending
    // Set.SortedSet<Person> people = new TreeSet<>(new PersonComparator().reverse());

    people.add(new Person("August"));
    people.add(new Person("June"));
    people.add(new Person("September"));

    for (var person : people) {
      System.out.println(person.getName());
    }

    SortedSet<Person> shortedSet = Collections.unmodifiableSortedSet(people);
    // error
    // shortedSet.add(new Person("October"));

  }
}
