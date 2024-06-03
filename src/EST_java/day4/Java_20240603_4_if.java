package EST_java.day4;

import java.util.Scanner;

public class Java_20240603_4_if {
  public static void main(String[] args) {
    // 문제 3

    int a = 10;
    int b = 20;

    if (a > b) {
      System.out.println("a is greater than b");
    } else if(a == b){
      System.out.println("a and b are equal");
    } else {
      System.out.println("a is less than b");
    }

    System.out.println((a>b)? "a is greater than b" : (a == b) ? "a and b are equal" :"a is less than b");
  }
}
