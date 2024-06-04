package EST_java.day5;

import java.util.stream.IntStream;

public class Java_20240604_7_while7 {
  public static void main(String[] args) {
    int[] num = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};

    int sum = 0;
    int sum2 = 0;
    int i = 0;

    while (i < num.length) {
      if (num[i] > 0) {
        sum += num[i];
      } else {
        sum2 += num[i];
      }
      i++;
    }

    System.out.println(sum);
    System.out.println(sum2);

//    int posNum = IntStream.of(num).filter(num -> num > 0).sum();
//    int neNum = IntStream.of(num).filter(num -> num < 0).sum();
//
//    System.out.println(posNum);
//    System.out.println(neNum);
  }
}
