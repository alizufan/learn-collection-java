package CollectionInterface;

import java.util.Arrays;
import java.util.List;

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
