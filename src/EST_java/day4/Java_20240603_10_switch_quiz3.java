package EST_java.day4;

public class Java_20240603_10_switch_quiz3 {
  public static void main(String[] args) {

    // 문제: 변수 operator에 '+', '-', '*', '/' 중
    // 하나의 문자가 저장되어 있습니다. 두 개의 정수형 변수 num1과 num2의 값에 따라
    // 해당 연산을 수행하고 결과를 출력하는 코드를 작성하세요.

    int num1 = 12;
    int num2 = 12;

    String operator = "*";

    switch(operator) {
        case "*":
            int i = num1 * num2;
            System.out.println(i);
            break;
        case "-":
            int i1 = num1 * -num2;
            System.out.println(i1);
            break;
        case "+":
            int i2 = num1 + num2;
            System.out.println(i2);
            break;
        case "/":
            int i3 = num1 / num2;
            System.out.println(i3);
            break;
    }
  }
}
