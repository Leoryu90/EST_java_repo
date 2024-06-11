package EST_java.day7;

public class Java_20240611_7_student {
  int level = 0;

  public Java_20240611_7_student() {
    this.level = 1;
  }

  public void levelUp() {
    level++;
    System.out.println("level up");
    System.out.println("level: " + level);
  }

  public void levelDown() {
    if (level > 1) {
      level--;
      System.out.println("레벨이 1감소 했습니다.");
      System.out.println("현재 레벨은 = " + level + "입니다.");
    } else {
      System.out.println("이미 돌머리입니다.");
      System.out.println("정신을 차리세요.");
    }
  }
}
