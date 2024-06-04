package EST_java.day5;

import java.util.stream.IntStream;

public class Java_20240604_9_for2 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);

//      boolean b = 100 % 2 == 0;
//      int sum2 = IntStream.of(100).filter(100 ->).sum();
  }
}
