package EST_java.day3;

public class Java_20240531_15 {
  public static void main(String[] args) {
        int positive = 10;
        int negative = -10;

      System.out.println("양의 부호 연산자 적용: " + (+positive)); // 10
      System.out.println("음의 부호 연산자 적용: " + (-positive)); // -10
      System.out.println("음의 부호 연산자로 부호 반전: " + (+negative)); // -10
      System.out.println("음의 부호 연산자로 다시 부호 반전: " + (-negative)); // 10
  }
}