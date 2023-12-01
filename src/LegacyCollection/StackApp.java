package LegacyCollection;

import java.util.EmptyStackException;
import java.util.Stack;

// # Stack Class
//   - Stack is an implementation of
//     the LIFO (Last In First Out) stack data structure.
//   - However, more complete and consistent features are provided in Deque,
//     so there is no longer any reason to use the Stack class.
//
public class StackApp {
  public static void main(String[] args) {

    Stack<String> names = new Stack<>();
    names.push("August");
    names.push("De");
    names.push("Caprio");

    try {
      for(var name = names.pop(); name != null; name = names.pop()) {
        System.out.println(name);
      }
    } catch (EmptyStackException e) {
      // do something when stack is empty
    }
  }
}
