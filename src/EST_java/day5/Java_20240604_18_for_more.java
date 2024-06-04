package EST_java.day5;

public class Java_20240604_18_for_more {
  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for (int i: arr) {
      if (i == 3) continue;
      System.out.println(i);
    }
  }
}
