package EST_java.day5;

import java.util.Arrays;

public class Java_20240604_6_while6 {
  public static void main(String[] args) {

    int[] num = {10, 5, 8, 20, 3, 15, 9, 2};

    System.out.println(Arrays.stream(num).max());

    int i = 0;
    int max = 0;

    while (i < num.length) {
      if (num[i] > max) {
        max = num[i];
      }
      i++;
    }

    System.out.println(max);


    int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};

    int max2 = numbers[0];
    int i2 = 1;
    while(i2<numbers.length){
      if (numbers[i2] > max2) {
        max2 = numbers[i2];
      }
      i2++;
    }
    System.out.println(max2);

  }
}
