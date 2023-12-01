package Set;

import java.util.EnumSet;

public class EnumSetApp {
  public static enum Gender {
    MALE, FEMALE, NOT_MENTION
  }

  public static void main(String[] args) {
    // # will grab all the enum options
    EnumSet<Gender> genders = EnumSet.allOf(Gender.class);

    // # optional example
    // EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE);

    // # also you can example
    // Set<Gender> genders = EnumSet.allOf(Gender.class);
    // Set<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE);

    for (var gender: genders) {
      System.out.println(gender);
    }
  }
}
