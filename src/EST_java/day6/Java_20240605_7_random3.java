package EST_java.day6;

import java.util.Scanner;

public class Java_20240605_7_random3 {
  public static void main(String[] args) {
    Scanner filmName = new Scanner(System.in);
    Scanner howMany = new Scanner(System.in);
    Scanner userName = new Scanner(System.in);
    Scanner userNumber = new Scanner(System.in);

    System.out.println("예매하실 영화 이름을 입력해 주세요");
    String fn = filmName.nextLine();

    System.out.println("인원수를 입력해 주세요");
    howMany.nextInt();

    System.out.println("당신의 이름을 입력해 주세요");
    userName.nextLine();

    System.out.println("전화번호를 입력해 주세요");
    userNumber.nextLine();

    System.out.printf("영화제목: %s", fn);
  }
}
