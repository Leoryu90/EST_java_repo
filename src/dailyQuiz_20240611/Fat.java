package dailyQuiz_20240611;

public class Fat {
  int myFat;

  public Fat(int getFat) {
    this.myFat = getFat;
  }

  public void eatFood() {
    System.out.println("당신은 지금 음식을 먹었습니다.");
    myFat++;
    System.out.println("살이 쪘습니다. 정신차리세요. 지금 " + myFat + "kg 입니다.");
  }

  public void lostFat() {
    myFat--;
    System.out.println("살이 빠졌습니다. 분발하세요. 지금" + myFat + "kg 입니다.");
  }
}
