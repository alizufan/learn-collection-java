package Map;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
  public static void main(String[] args) {
    System.out.println("\n # Intro Navigable Map Section");
    NavigableMap<String, String> map = new TreeMap<>();

    map.put("last", "Caprio");
    map.put("first", "August");
    map.put("middle", "De");

    for(var key : map.keySet()) {
      System.out.println(key);
    }

    System.out.println(map.lowerKey("last"));
    System.out.println(map.higherKey("last"));

    System.out.println("\n # Navigable Map Desc Section");

    NavigableMap<String, String> mapDesc = map.descendingMap();

    for(var key : mapDesc.keySet()) {
      System.out.println(key);
    }

    NavigableMap<String, String> empty = Collections.emptyNavigableMap();
    NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);

    // Note:
    // error unsupported exception
    // immutable.put("family", "D");
  }
}
