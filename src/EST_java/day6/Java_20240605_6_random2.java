package EST_java.day6;

import java.util.Random;
import java.util.Scanner;

public class Java_20240605_6_random2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int targetNumber = rand.nextInt(100) + 1;
    int input;

    do {
      input = sc.nextInt();
      if (input > targetNumber) System.out.println("더 낮은 값을 입력해보세요");
      else if (input < targetNumber) System.out.println("더 높은 값을 입력해보세요");
    } while (input != targetNumber);

    System.out.println("정답입니다!");


  }
}
