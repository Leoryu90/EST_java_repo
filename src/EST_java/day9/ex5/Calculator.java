package EST_java.day9.ex5;

public class Calculator {
  private static final double PI = 3.141592;

  double areaCircle(double r) {
    System.out.println("Calculator 객체의 areaCircle 메서드 실행");
    return PI * r * r;
  }

  void say() {
    System.out.println("아무런 문자열만 출력해 주세요.");
  }

}
