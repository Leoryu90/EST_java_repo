package EST_java.day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Java_20240619_set1 {
  public static void main(String[] args) {
    Set<Integer> integerSet = new HashSet<>();

    integerSet.add(1);
    integerSet.add(2);
    integerSet.add(3);
    integerSet.add(4);
    integerSet.add(5);

    Iterator<Integer> iterator = integerSet.iterator();

//    while (iterator.hasNext()) {
//      System.out.println(iterator.next());
//    }

      while(iterator.hasNext()){
          iterator.next();
          iterator.remove();
      }

  }
}
