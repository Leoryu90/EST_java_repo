package EST_java.day10;

import java.util.Scanner;

public class Java_20240614_error {
  public static void main(String[] args){
      try{
          int result = 10 / 0;
          System.out.println(result);
      } catch (ArithmeticException e){
          System.out.println(e);
      }
  }
}
