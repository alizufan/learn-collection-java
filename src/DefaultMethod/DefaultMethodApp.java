package DefaultMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

// # Default Method
//   - In Java 8 there is a feature called Default Method,
//      where we can add concrete methods in the interface.
//   - This feature is widely used in Java Collections.
//      We know that all collections in Java have interface contracts,
//      so in Java you can easily improve the capabilities of
//      all collections just by adding a default method in the collection interface.
//
public class DefaultMethodApp {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 1; i <= 100; i++) {
      numbers.add(i);
    }

    System.out.println(numbers);

    numbers.replaceAll(new UnaryOperator<Integer>(){
      @Override
      public Integer apply(Integer integer) {
        return integer * 10;
      }
    });

    System.out.println(numbers);

    numbers.forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer integer) {
        System.out.println(integer);
      }
    });

    numbers.removeIf(new Predicate<Integer>() {
      @Override
      public boolean test(Integer integer) {
        return integer > 500;
      }
    });

    System.out.println(numbers);
  }
}
