package List.ImmutableList;

import java.util.Collections;
import java.util.List;

public class Person {
  private String name;
  private List<String> hobbies;

  public Person(String name, List<String> hobbies) {
    this.name = name;
    this.hobbies = hobbies;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getHobbies() {
    // # Problem
    // If you use 'return hobbies' will cause the hobby data to become mutable data,
    // so that it can be modified by other classes. This can cause unexpected errors,
    // a 'hobbies' field should only be modified by the class itself.
    //
    // return hobbies;

    // # Solution
    // is convert from mutable to immutable.
    // By using 'return Collections.unmodifiableList(hobbies)'
    // this will protect the 'hobbies' field.
    //
    return Collections.unmodifiableList(hobbies);
  }

  public void setHobbies(List<String> hobbies) {
    this.hobbies = hobbies;
  }

  public void addHobby(String hobby) {
    this.hobbies.add(hobby);
  }
}
