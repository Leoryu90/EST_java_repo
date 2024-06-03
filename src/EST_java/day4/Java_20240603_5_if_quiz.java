package EST_java.day4;

public class Java_20240603_5_if_quiz {
  public static void main(String[] args) {
    // quiz

    int x = 10;

    if (x % 2 == 0) {
      System.out.println("양수입니다.");
    } else {
      System.out.println("음수입니다.");
    }

    System.out.println((x % 2 == 0) ? "양수입니다." : "음수입니다.");

    // quiz2

    int score = 75;
    String grade = "";

    if (score >= 90) {
      grade = "A";
      System.out.println(String.format("당신의 학점은 %s 입니다",  grade));
    } else if (score >= 80) {
      grade = "B";
      System.out.println(String.format("당신의 학점은 %s 입니다",  grade));
    } else if (score >= 70) {
      grade = "C";
      System.out.println(String.format("당신의 학점은 %s 입니다",  grade));
    } else if (score >= 60) {
      grade = "D";
      System.out.println(String.format("당신의 학점은 %s 입니다",  grade));
    } else {
      grade = "F";
      System.out.println(String.format("당신의 학점은 %s 입니다",  grade));
    }

    // quiz3

    int year = 2023;

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println("윤년입니다.");
    } else {
      System.out.println("윤년이 아닙니다.");
    }

    // quiz4

    int a = 10;
    int b = 20;
    int c = 30;

    if (a > b && a > c) {
      System.out.println("a가 제일 큽니다.");
    } else if(b > a && b > c){
      System.out.println("d가 제일 큽니다.");
    } else {
      System.out.println("c가 제일 큽니다.");
    }

    // quiz 5

    int passScore = 60;
    int myScore = 75;

    if (myScore > passScore) {
      System.out.println("합격의 목걸이");
    } else {
      System.out.println("불합격입니다.");
    }

    System.out.println((myScore > passScore) ? "합격의 목걸이" : "불합격입니다.");
  }
}
