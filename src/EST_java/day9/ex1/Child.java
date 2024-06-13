package EST_java.day9.ex1;

public class Child extends Parent {
    public void stealMoney(int poketMoney) {
        money -= poketMoney;
    System.out.println("부모님의 돈을 용돈이라고 생각하고 " + poketMoney + "원을 지갑에서 가져왔습니다.");
    }
}
