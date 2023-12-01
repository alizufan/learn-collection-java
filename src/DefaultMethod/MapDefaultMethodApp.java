package DefaultMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
  public static void main(String[] args) {
    Map<String, String> map =  new HashMap<>();
    map.put("first", "August");
    map.put("middle", "De");
    map.put("last", "Caprio");

    map.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String key, String value) {
        System.out.println("key: " + key + ", Value: " + value);
      }
    });
  }
}
