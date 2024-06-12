package dailyQuiz_20240611;

public class Human {
  String name;
  int age;
  String place;

  public Human(String name, int age, String place) {
    this.name = name;
    this.age = age;
    this.place = place;
  }

  public void sayHello() {
    System.out.println("안녕하세요. 저는 " + name + " 입니다.");
  }

  public void sayMyAge() {
    System.out.println("저의 나이는 " + age + "살 입니다.");
  }

  public void sayMyPlace() {
    System.out.println("저는 " + place + "에서 살고 있습니다.");
  }

  public void nowLevel(JavaStudy study) {
    System.out.println("지금의 자바 레벨은 " + study.javaLevel + "입니다.");
  }

  public void goToBootcamp(JavaStudy study) {
    System.out.println("부트캠프에 참여했습니다.");
    study.javaLevelUp();
  }

  public void studyMySelf(JavaStudy study) {
    System.out.println("자습을 강행했습니다.");
    study.javaLevelUp();
  }

  public void goToDate(JavaStudy study) {
    System.out.println("행복하게 데이트를 했습니다. 하지만");
    study.javaLevelDown();
  }

  public void nowFat(Fat fat) {
    System.out.println("지금 몸무게는 " + fat.myFat + "kg 입니다.");
  }

  public void eatFood(Fat fat){
    fat.eatFood();
  }

  public void running(Fat fat){
    System.out.println("운동으로 달리기를 했습니다.");
    fat.lostFat();
  }
}
