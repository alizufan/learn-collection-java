package List.ImmutableList;

import java.util.ArrayList;
import java.util.List;

// # Immutable List
//   - By default, Lists in Java, whether 'ArrayList' or 'LinkedList',
//     have mutable data.
//   - Java supports creating Immutable Lists,
//     meaning the data cannot be changed again.
//   - Once a List is created,
//     the data cannot be changed again, it is final.
//   - But remember, it is the data list that cannot be changed,
//     not the reference object element. For example, if you create an Immutable List containing Person data, the Person data field can still be changed, but the contents of the elements of the Immutable List cannot be changed anymore.
//   - This is suitable in cases where, for example,
//     not random code can change elements in the List.
//
// # How To Create Immutable List
//   -----------------------------------------------------------------------------------------
//   | Method                              | Description                                     |
//   -----------------------------------------------------------------------------------------
//   | Collections.emptyList()             | Create an empty immutable list.                 |
//   | Collections.singletonList(e)        | Create an immutable list containing 1 element.  |
//   | Collections.unmodifiableList(list)  | Changing the mutable list to immutable.         |
//   | List.of(e...)                       | Create an immutable list of elements.           |
//   -----------------------------------------------------------------------------------------
//
//
public class ImmutableListApp {
  public static void main(String[] args) {
    Person person = new Person("August", new ArrayList<>());
    person.addHobby("coding");
    person.addHobby("gaming");

    // a bad boy!
    doSomething(person.getHobbies());

    for (var hobby: person.getHobbies()) {
      System.out.println(hobby);
    }

    // # Immutable List
    List<String> names = List.of("August", "June", "September");

    // Error: UnsupportedOperationException
    //
    // names.set(0, "Gamer");
    // names.remove("Never");
    // names.add("Look up");
  }

  public static void doSomething(List<String> hobbies) {
    hobbies.add("evil-laugh");
  }
}
