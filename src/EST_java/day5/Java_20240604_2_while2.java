package EST_java.day5;

public class Java_20240604_2_while2 {
  public static void main(String[] args) {
    int i = 10;

    while (i >= 0) {
      System.out.println("현재 카운트: " + i);
      if (i == 0) {
        System.out.println("카운트 종료");
      }
      i--;
    }
  }
}
