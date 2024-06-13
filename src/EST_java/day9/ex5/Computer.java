package EST_java.day9.ex5;

public class Computer extends Calculator {

  @Override
  double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle 메서드 실행");
    return Math.PI * r * r;
  }

  @Override
  void say() {
    System.out.println("이것은 수류탄이오.");
  }
}
