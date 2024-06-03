package EST_java.day4;

import java.util.Calendar;

public class Java_20240603_8_switch_quiz {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();

    int datOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

    switch (datOfWeek) {
      case 0:
        System.out.println("놀거야?");
        break;
      case 1:
        System.out.println("코딩은 접었니? 왜그러니");
        break;
      case 2:
        System.out.println("화이팅 해");
        break;
      case 3:
        System.out.println("코딩해야지");
        break;
      case 4:
        System.out.println("오늘은 모각코");
        break;
      case 5:
        System.out.println("코딩은 생활이다");
        break;
      case 6:
        System.out.println("하루정도는 놀까?");
    }
  }
}
