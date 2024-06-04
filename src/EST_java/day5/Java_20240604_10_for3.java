package EST_java.day5;

import java.util.Scanner;

public class Java_20240604_10_for3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;

    for (int i = 0; i < num; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        sum += i;
      }
    }

    System.out.println(sum);
  }
}
