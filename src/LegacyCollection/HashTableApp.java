package LegacyCollection;

import java.util.Hashtable;
import java.util.Map;

// # Hash Table
//   - HashTable is an implementation of 'Map' which is similar to 'HashMap'.
//   - Just like 'Vector', all methods in 'HashTable' have
//     the synchronized keyword, so performance is slower than 'HashMap'.
//   - And because in the new Java version there is also 'ConcurrentHashMap',
//     so the use of 'HashTable' is rarely found.
//
public class HashTableApp {
  public static void main(String[] args) {
    Map<String, String> map = new Hashtable<>();

    map.put("firstName", "August");
    map.put("middleName", "De");
    map.put("lastName", "Caprio");

    for(var key: map.keySet()) {
      System.out.println(key);
    }
  }
}
