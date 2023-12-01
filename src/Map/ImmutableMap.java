package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// # Immutable Map
//   - Just like List and Set, Map also has the Immutable data type.
//
// # Create Immutable Map
//   --------------------------------------------------------------------------------------
//   |  Method                              | Description                                 |
//   --------------------------------------------------------------------------------------
//   | Collections.emptyMap()               | Create an empty immutable map.              |
//   | Collections.unmodifiableMap(map)     | Change the mutable map to immutable.        |
//   | Collections.singletonMap(key, value) | Create a map with one number of key-values. |
//   | Map.of(...)                          | Create an immutable map from key-values.    |
//   --------------------------------------------------------------------------------------
//
public class ImmutableMap {
  public static void main(String[] args) {

    Map<String, String> empty = Collections.emptyMap();
    Map<String, String> singleton = Collections.singletonMap("firstName", "August");

    Map<String, String> mutable = new HashMap<>();
    mutable.put("name", "June");
    Map<String, String> immutable = Collections.unmodifiableMap(mutable);

    Map<String, String> map = Map.of(
            "firstName", "August",
            "middleName", "De",
            "lastName", "Caprio"
    );

    // error unsupported
    // map.put("middleName", "The");
  }
}
