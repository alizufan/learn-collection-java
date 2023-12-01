package Map;

import java.util.*;

// # Map
//  - Map is a collection data structure
//    that contains mapping between keys and values.
//  - Where the keys in the map must be unique,
//    cannot be duplicates, and one key can only map to one value.
//  - Maps are actually similar to Arrays,
//    the only difference is that in Arrays,
//    the keys are indexes (integers), whereas in Maps,
//    we are free to determine the keys according to our wishes.
//
// # HashMap
//  - HashMap is a Map implementation
//    that distributes keys using the hashCode() function.
//  - Because HashMap is very dependent on the hashCode() function,
//    make sure we make the hashCode function as unique as possible,
//    because if there are too many hashCode() values that are the same,
//    then the key distribution will not be optimal,
//    so the process of getting data in the Map will be slower.
//  - In HashMap, checking for duplicate data
//    is done using the 'equals' method.
//
// # Note:
//  - for the 'hashCode' method, you can use ideas that can generate to get the optimal code.
//
// # WeakHashMap
//   - 'WeakHashMap' is an implementation of
//     'Map' similar to 'HashMap'.
//   - What is different is that 'WeakHashMap' uses a 'weak key',
//     where if it is no longer used, then the data in - 'WeakHashMap'
//     will automatically be deleted.
//   - This means that if garbage collection occurs in Java,
//     it is possible that the data in WeakHashMap will be deleted.
//   - 'WeakHashMap' is suitable for temporarily storing cache data in memory.
//
// # IdentityHashMap
//   - 'IdentityHashMap' is an implementation of 'Map' just like 'HashMap'.
//   - What is different is the way to check the equality of the data,
//     not using the 'equals' function, but using the == (reference equality) operator.
//   - This means that the data is considered the same
//     if the location in memory is the same.
//
// # Linked Hash Map
//   - 'LinkedHashMap' is an implementation of 'Map' using a double linked list.
//   - The data in 'LinkedHashMap' will be more predictable
//     because the data will be stored sequentially in
//     the linked list in the order we store the data.
//   - However, please note, the process of getting data in 'LinkedHashMap'
//     will be slower because you have to iterate over the linked list data first.
//   - Use 'LinkedHashMap' if we are more concerned with iterating the Map data.
//
// # Enum Map
//   - 'EnumMap' is an implementation of 'Map' where the key is an enum.
//   - Because enum data is definitely unique,
//     therefore it is suitable as a key in 'Map'.
//   - The key distribution algorithm is optimized for enums,
//     so it is more optimal than using the 'hashCode()' method.
//
public class MapApp {
  public static void main(String[] args) {
    System.out.println("\n # Hash Map Section\n");

    Map<String, String> map = new HashMap<>();

    map.put("firstName", "August");
    map.put("middleName", "De");
    map.put("lastName", "Caprio");

    System.out.println(map.get("firstName"));
    System.out.println(map.get("middleName"));
    System.out.println(map.get("lastName"));

    System.out.println("\n # Weak Hash Map Section\n");

    // Note:
    // Its perfect for cache.
    Map<Integer, String> weakHashMap = new WeakHashMap<>();
    for (int i = 0; i < 1_000_000; i++) {
      weakHashMap.put(i, String.valueOf(i));
    }

    // # trigger clear memory manually
    System.gc();

    // # check week hash map size, after trigger gc
    System.out.println(weakHashMap.size());

    System.out.println("\n # Identity Hash Map Section\n");

    // This 'IdentityHashMap' is using equal operation (==) to compare hash code
    // because that the size have 2 not 1.
    Map<String, String> identityHashMap = new IdentityHashMap<>();

    // If you change to 'HashMap', 'HashMap' is using 'equals' method to compare a value not an object.
    // That's why when you get a size only appear 1.
    // Map<String, String> identityHashMap = new HashMap<>();

    String keyNameFirst = "name.first";
    String name = "name";
    String dot = ".";
    String first = "first";

    String keyNameFirst2 = name + dot + first;

    System.out.println(keyNameFirst.equals(keyNameFirst2));
    System.out.println(keyNameFirst == keyNameFirst2);

    identityHashMap.put(keyNameFirst, "August");
    identityHashMap.put(keyNameFirst2, "August");

    System.out.println(identityHashMap.size());

    System.out.println("\n # Linked Hash Map Section\n");

    // predicted list order
    Map<String, String> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put("name.first", "August");
    linkedHashMap.put("name.middle", "De");
    linkedHashMap.put("name.last", "Caprio");

    for (var key : linkedHashMap.keySet()) {
      System.out.println(key);
    }

    System.out.println("\n # Enum Map Section\n");
    EnumMap<Level, String> enumMap = new EnumMap<>(Level.class);
    enumMap.put(Level.FREE, "August");
    enumMap.put(Level.STANDARD, "June");
    enumMap.put(Level.PREMIUM, "September");
    enumMap.put(Level.VIP, "November");

    System.out.println(Level.FREE + "     : " + enumMap.get(Level.FREE));
    System.out.println(Level.STANDARD + " : " + enumMap.get(Level.STANDARD));
    System.out.println(Level.PREMIUM + "  : " + enumMap.get(Level.PREMIUM));
    System.out.println(Level.VIP + "      : " + enumMap.get(Level.VIP));
  }

  public static enum Level {
    FREE, STANDARD, PREMIUM, VIP
  }
}
