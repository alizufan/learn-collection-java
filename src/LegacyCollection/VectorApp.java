package LegacyCollection;

import java.util.List;
import java.util.Vector;

// # Vector Class
//  - 'Vector' class is an implementation of the 'List' interface.
//  - The way Vector works is similar to 'ArrayList', the difference is that all methods in Vector use the synchronized keyword, which means it is thread safe.
//  - However, the problem is, because all methods use the synchronized keyword, the impact on performance automatically becomes slower compared to using 'ArrayList'.
//  - Floor what if we want to create a List that can be used in parallel processes? In the new Java version, a more sophisticated version has been provided for this, therefore the use of 'Vector' is rarely found now.
public class VectorApp {
  public static void main(String[] args) {
    List<String> list = new Vector<>();

    list.add("August");
    list.add("De");
    list.add("Caprio");

    for(var value: list) {
      System.out.println(value);
    }
  }
}
