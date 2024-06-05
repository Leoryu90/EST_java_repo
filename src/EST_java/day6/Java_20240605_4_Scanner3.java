package EST_java.day6;

import java.util.Scanner;

public class Java_20240605_4_Scanner3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String season = "";

    switch (num) {
      case 1:
        season = "봄";
        break;
      case 2:
        season = "여름";
        break;
      case 3:
        season = "가을";
        break;
      case 4:
        season = "겨울";
        break;
      default:
        season = "잘몯된 입력입니다!";
    }

    System.out.println(season);
    }
}
