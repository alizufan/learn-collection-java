package Map;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

// # Sorted Map App
//   - 'SortedMap' is a Map implementation with key data sorted according to
//     the 'Comparable' key, or you can use a 'Comparator'.
//   - 'SortedMap' is suitable for cases where
//     the key positions in the 'Map' must be ordered.
//
// # Immutable Sorted Map Method
//  --------------------------------------------------------------------------------------
//  | Method                                  | Description                              |
//  --------------------------------------------------------------------------------------
//  | Collections.emptySortedMap()            | Create an empty immutable sorted map.    |
//  | Collections.unmodifiableSortedMap(map)  | Change mutable sorted map to immutable.  |
//  --------------------------------------------------------------------------------------
//
public class SortedMapApp {
  public static void main(String[] args) {
    Comparator<String> stringComparator = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    };

    // Note:
    // If you want to sort 'asc/desc', change the comparator code.
    SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

    sortedMap.put("last", "Caprio");
    sortedMap.put("first", "August");
    sortedMap.put("middle", "De");

    for(var key : sortedMap.keySet()) {
      System.out.println(key);
    }

    SortedMap<String, String> empty = Collections.emptySortedMap();
    SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

    // Note:
    // Error unsupported operation exception
    // immutable.put("family", "D");
  }
}
