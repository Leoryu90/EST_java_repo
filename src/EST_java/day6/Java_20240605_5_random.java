package EST_java.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Java_20240605_5_random {
  public static void main(String[] args) {
    Random random = new Random();
    ArrayList<Integer> list = new ArrayList<Integer>();

    while (list.size() != 6) {
      int number = random.nextInt(45) + 1;
      if (!list.contains(number)) {
        list.add(number);
      }
    }

    Collections.sort(list);

    for(int data:list){
      System.out.print(data + " ");
    }
  }
}
