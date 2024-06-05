package EST_java.day6;

import java.util.Scanner;

public class Java_20240605_2_Scanner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력하세여: ");
    int a = sc.nextInt();

    System.out.println("내가 입력한 값은 " + a);

    sc.close();
  }
}
