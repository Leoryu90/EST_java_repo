package EST_java.day5;

public class Java_20240604_17_continue {
  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      if (i == 4 || i == 7) {
        continue;
      }
      System.out.println(i);
    }
  }
}
