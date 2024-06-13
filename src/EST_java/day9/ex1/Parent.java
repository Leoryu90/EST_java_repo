package EST_java.day9.ex1;

public class Parent {
  protected int money = 0;

  public void savingMoney(int money) {
    this.money += money;
    System.out.println(money + "원을 부모님께 맡겼습니다.");
  }
}
