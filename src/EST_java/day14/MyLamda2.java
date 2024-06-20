package EST_java.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyLamda2 {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 ,9));

    numbers.removeIf((integer)-> integer % 2 == 0);

//    Iterator<Integer> iterator = numbers.iterator();
//
//    while (iterator.hasNext()) {
//      Integer next = iterator.next();
//      if (next % 2 == 0) {
//        iterator.remove();
//      }
//    }
//    System.out.println(numbers);

  }
}
