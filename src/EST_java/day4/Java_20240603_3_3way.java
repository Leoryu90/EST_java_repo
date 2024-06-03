package EST_java.day4;

public class Java_20240603_3_3way {
  public static void main(String[] args) {
    int score = 95;

    String grade = (score == 95 && score % 5 == 0) ? "good" : "bad";
    System.out.println(grade);

    if (score == 95 && score % 5 == 0) {
      System.out.println("good");
    } else {
      System.out.println("bad");
    }
  }
}
