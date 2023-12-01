package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// # Sorting
//   - Sorting is an algorithm that we are used to.
//   - In Java 'Collection' a way to sort is also provided,
//     so we don't need to sort manually.
//   - But remember, what can be sorted is only Lists,
//     because 'Set', 'Queue', 'Deque' and 'Map' work in a special way,
//     so sorting can only be done in 'List'.
//
// # Sorting Method
//  -----------------------------------------------------------------------------------------------
//  | Method                              | Description                                           |
//  -----------------------------------------------------------------------------------------------
//  | Collections.sort(list)              | Sorts the list with the built-in comparable elements. |
//  | Collections.sort(list, comparator)  | Sort a list with a comparator.                        |
//  -----------------------------------------------------------------------------------------------
//
public class SortingApp {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.addAll(List.of("August", "De", "Caprio"));

    System.out.println("# Sort List");
    Collections.sort(names);
    for (var name: names) {
      System.out.println(name);
    }

    Comparator<String> reverse = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    };

    System.out.println("\n # Reverse List");
    Collections.sort(names, reverse);
    for (var name: names) {
      System.out.println(name);
    }
  }
}
