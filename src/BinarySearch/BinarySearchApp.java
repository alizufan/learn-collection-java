package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    for(int i = 1; i <= 1000; i++) {
      list.add(i);
    }

    int index = Collections.binarySearch(list, 333);
    System.out.println(index);
  }
}
