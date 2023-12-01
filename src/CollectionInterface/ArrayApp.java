package CollectionInterface;

import java.util.Arrays;
import java.util.List;

// # Collection interface
//   - The Collection interface has a toArray()
//     method to convert a collection to an Array.
//   - This is very suitable if we want to change a collection to an Array,
//     for example, because we want to call a method whose parameters are of the type array, not collection.
//
public class ArrayApp {
  public static void main(String[] args) {
    List<String> names = List.of("August", "De", "Caprio");

    // # To Object Type
    Object[] objects = names.toArray();

    // # Specific Type
    String[] strings = names.toArray(new String[] {});

    System.out.println(Arrays.toString(objects));
    System.out.println(Arrays.toString(strings));
  }
}
