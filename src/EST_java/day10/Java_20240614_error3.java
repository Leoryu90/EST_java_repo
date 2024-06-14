package EST_java.day10;

import java.util.Scanner;

public class Java_20240614_error3 {
  public static void main(String[] args) {

    //    try {
    //      int divide = 10 / 0;
    //      System.out.println(divide);
    //    } catch (NullPointerException e) {
    //      System.out.println("0으로 나눌 수 없습니다.");
    //    }finally{
    //      System.out.println("이건 예외여부와 상관없이 항상 실행됩니다.");
    //    }

    Scanner scanner = new Scanner(System.in);
    try {
      int i = scanner.nextInt();
      int result = i / 0;
      System.out.println(result);
    } catch (NullPointerException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } finally {
      System.out.println("스캐너를 종료");
      scanner.close();
    }
  }
}
