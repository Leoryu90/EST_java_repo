package EST_java.day11.ex2;

public class Kiacar implements Car {
  @Override
  public String showEngine() {
    return "똥모터";
  }

  @Override
  public int amountNavi() {
    return 100;
  }

  @Override
  public String getTier() {
    return "기아 타이어";
  }

  public static void main(String[] args) {
    Kiacar kiacar = new Kiacar();

    System.out.println(kiacar.showEngine());
    System.out.println(kiacar.getTier());
    System.out.println(kiacar.amountNavi());
  }
}
