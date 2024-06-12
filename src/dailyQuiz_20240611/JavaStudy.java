package dailyQuiz_20240611;

public class JavaStudy {
  int javaLevel;

  public JavaStudy() {
    this.javaLevel = 1;
  }

  public void javaLevelUp() {
    javaLevel++;
    System.out.println("자바를 공부해서 자바의 레벨이 " + javaLevel + " 으로(로) 올랐습니다.");
  }

  public void javaLevelDown() {
    if (javaLevel > 1) {
      javaLevel--;
      System.out.println("놀아서 자바의 레벨이 " + javaLevel + " 으로(로) 감소했습니다.");
    }else {
      System.out.println("지금 당신의 레벨은" + javaLevel +"입니다.");
      System.out.println("돌머리니까 놀지말고 정신을 차리세요.");
    }
  }
}
