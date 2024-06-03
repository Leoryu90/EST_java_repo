package EST_java.day4;

import static java.lang.System.*;

public class Java_20240603_12_switch_quiz5 {
  public static void main(String[] args) {

    int score = (int) (Math.random() * 101);

    switch (score / 10) {
      case 10:
        out.println("A+ 만점입니다0");
        break;
      case 9:
        out.println("A");
        break;
      case 8:
        out.println("B");
        break;
      case 7:
        out.println("C");
        break;
      case 6:
        out.println("D");
        break;
      default:
        out.println("F");
    }
  }
}
