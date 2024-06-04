package EST_java.day5;

import java.util.Arrays;

public class Java_20240604_11_for4 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    arr[0] = 1;
    arr[1] = 1;

    for (int i = 2; i < 10; i++) {
      arr[i] = arr[i - 2] + arr[i - 1];
    }

    System.out.println(Arrays.toString(arr));
  }
}
