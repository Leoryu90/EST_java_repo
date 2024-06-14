package EST_java.day10.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleMain1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("정수 하나를 입력해주세요.");
      int n1 = sc.nextInt();
      System.out.print("정수 하나를 더 입력해주세요.");
      int n2 = sc.nextInt();

      System.out.println("나눈값은 " + (n1 / n2) + "입니다.");

    } catch (ArithmeticException e) {
      System.out.println("0으로 나눗셈은 하지 못합니다.");
    } catch (InputMismatchException e) {
      System.out.println("정수로 입력해 주세요");
    } finally{
      sc.close();
    }
  }
}
