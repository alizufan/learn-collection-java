package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// # Immutable Set
//   - Just like 'List', Set also has the Immutable data type.
//   - The way to create an immutable Set in Java is similar to creating an immutable List.
// # Create Immutable Set
//  ---------------------------------------------------------------------------------------
//  | Method                            | Description                                     |
//  ---------------------------------------------------------------------------------------
//  | Collections.emptySet()            | Creates an empty immutable set.                 |
//  | Collections.singleton(e)          | Creates an immutable set containing 1 element.  |
//  | Collections.unmodifiableSet(set)  | Converts mutable set to immutable.              |
//  | Set.of(e...)                      | Creates an immutable set of elements.           |
//  ---------------------------------------------------------------------------------------
//
public class ImmutableSetApp {
  public static void main(String[] args) {
    Set<String> empty = Collections.emptySet();
    Set<String> one = Collections.singleton("August");

    Set<String> mutable = new HashSet<>();
    mutable.add("August");
    mutable.add("Caprio");

    // # Convert Mutable to Immutable
    Set<String> immutable = Collections.unmodifiableSet(mutable);

    // # Immutable Set
    //   - Cannot duplicate
    Set<String> set = Set.of("September", "Caprio");

    // # This test will cause an error.
    // set.add("January");
    // set.remove("June");
  }
}
