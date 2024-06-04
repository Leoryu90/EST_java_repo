package EST_java.day5;

import java.util.Arrays;

public class Java_20240604_13_for6 {
  public static void main(String[] args) {
    int[] arr = new int[100];
    arr[0] = 1;
    arr[1] = 1;

    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i - 2] + arr[i - 1];
    }

    System.out.println(Arrays.toString(arr));

//    Arrays.parallelSetAll(arr,i->(i<2)?1:arr[i-1]+ arr[i-2]);
//    Arrays.setAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]);
  }
}
