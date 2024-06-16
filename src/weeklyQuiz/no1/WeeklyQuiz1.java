package weeklyQuiz.no1;

import java.util.InputMismatchException;
import java.util.Scanner;

import static weeklyQuiz.no1.MyCalculator.*;

public class WeeklyQuiz1 {
  public static int myRemainder(int a, int b) {
    return a % b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int result = 0;

    try{
    while (true) {
      System.out.println("원하는 기능을 선택하세요.");
      System.out.println("1. 덧셈 / 2. 뺄셈 / 3. 곱셈 / 4. 나눗셈 / 5. 나머지 구하기 / 0. 종료");
      int toDo = sc.nextInt();
      int num1;
      int num2;

      if (toDo == 0) {
        System.out.println("프로그램을 종료합니다.");
        break;
      } else if (toDo <= 5) {
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
        num1 = sc.nextInt();
        System.out.println("두번째 값을 입력하고 엔터를 누르세요");
        num2 = sc.nextInt();

      } else {
        System.out.println("잘못 입력했습니다. 다시 입력해주세요");
        continue;
      }

      switch (toDo) {
        case 1:
          result = mySum(num1, num2);
          break;
        case 2:
          result = myMinus(num1, num2);
          break;
        case 3:
          result = myMultiply(num1, num2);
          break;
        case 4:
          result = myDivide(num1, num2);
          break;
        case 5:
          result = WeeklyQuiz1.myRemainder(num1, num2);
          break;
        default:
      }

      System.out.println(STR."계산한 값은 \{result} 입니다.");
    }

    } catch (InputMismatchException e) {
      System.out.println("정수형 숫자로 입력해주세요.");
      System.out.println("프로그램을 종료합니다.");
    }
  }
}
