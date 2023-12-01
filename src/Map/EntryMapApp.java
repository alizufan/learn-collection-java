package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapApp {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put("last", "Caprio");
    map.put("first", "August");
    map.put("middle", "De");

    Set<Map.Entry<String, String>> entries = map.entrySet();

    for(var entry : entries) {
      System.out.println("Key :" + entry.getKey() + ", Value :" + entry.getValue());
    }

  }
}
