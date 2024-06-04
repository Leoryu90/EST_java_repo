package EST_java.day5;

public class Java_20240604_16_break1 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println("now i = " + i);
      for (int j = 0; j < 10; j++) {
        System.out.println("now j = " + j);
        if (j == 5) {
          break;
        }
      }
    }
  }
}
