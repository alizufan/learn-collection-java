package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// # List
//   - List is a collection data structure that has the following properties:
//     + an Elements in the list can be duplicates,
//       meaning they can include the same data.
//     + a Data list is ordered according to
//       the position we entered the data.
//     + a Lists have indexes, so we can use
//       the index number to get the elements in the list.
//   - In Java, there are several implementations of the List,
//     and we can choose, according to our needs.
//
// # 'ArrayList' Class
//   - ArrayList is an implementation of List using arrays.
//   - The default array capacity in ArrayList is 10.
//   - However, when we enter data and the array is full,
//     ArrayList will automatically create a new array with a new capacity with
//     the size of the old capacity + new data.
//
// # 'LinkedList' Class
//   - LinkedList is a List implementation with a
//     Double Linked List data structure.
//   - For those of you who have studied data structures at school/college,
//     you definitely know what a double-linked list is.
//
// # 'ArrayList' vs 'LinkedList'
//   --------------------------------------------------------------------------------------------------------------
//   | Operation | ArrayList                                       | LinkedList                                   |
//   --------------------------------------------------------------------------------------------------------------
//   | add       | Fast if the Array capacity is still sufficient. | Fast because it only adds nodes at the end.  |
//   |           | Slow if it is full.                             |                                              |
//   | get       | Fast because you just use the array index.      | Slow because you have to check from          |
//   |           |                                                 | the starting node until you find the index.  |
//   | set       | Fast because you just use the array index.      | Slow because you have to check from          |
//   |           |                                                 | the starting node until you find it.         |
//   | remove    | Slow because you have to shift the data behind  | Fast because you just need to change.        |
//   |           | the deleted one.                                | the prev and next on the node next           |
//   |           |                                                 | to the deleted one.                          |
//   --------------------------------------------------------------------------------------------------------------
//
// # Note
//   - 'ArrayList' is suitable for use when you do
//     a lot of data modification processes.
//   - 'LinkedList' is suitable for use when you only
//     need to carry out the process of getting data.
//
public class ListApp {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    // List<String> names = new LinkedList<>();

    names.add("August");
    names.add("De");
    names.add("Caprio");

    names.set(0, "June");

    System.out.println(names.get(0));
    System.out.println(names.get(1));
  }
}
