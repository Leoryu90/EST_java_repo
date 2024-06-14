package EST_java.day10.ex2;

import java.util.Scanner;

public class ExampleMain2 {
  public static void main(String[] args) {

    // 사용자로부터 정수 배열의 크기와 배열 요소를 입력받아 배열을 생성하는 프로그램을 작성하세요.
    // 이때, 입력된 인덱스가 배열의 크기를 벗어나면 ArrayIndexOutOfBoundsException을 처리하여 적절한 메시지를 출력하세요.

    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("배열의 크기를 입력하세요: ");
      int size = scanner.nextInt();

      int[] arr = new int[size]; // 입력받은 크기로 배열 생성

      System.out.println("배열 요소를 입력하세요:");
      for (int i = 0; i < size; i++) {
        System.out.print("arr[" + i + "] = ");
        arr[i] = scanner.nextInt();
      }

      System.out.println("배열 출력:");
      for (int i = 0; i < size; i++) {
        System.out.println("arr[" + i + "] = " + arr[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열의 인덱스가 범위를 벗어났습니다."); // ArrayIndexOutOfBoundsException 처리
    } finally {
      scanner.close(); // scanner 자원 해제
    }
  }
}
