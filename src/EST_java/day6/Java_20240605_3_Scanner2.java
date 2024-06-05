package EST_java.day6;

import java.util.Scanner;

public class Java_20240605_3_Scanner2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수를 입력하세요.");
    int a = sc.nextInt();
    sc.nextLine();

    System.out.println("문자열을 입력하세요");
    String b = sc.nextLine();

    
    sc.close();
    }
}
