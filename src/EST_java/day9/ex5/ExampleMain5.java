package EST_java.day9.ex5;

public class ExampleMain5 {
  public static void main(String[] args) {
    int r = 10;
    Calculator calculator = new Calculator();
    System.out.println("원면적" + calculator.areaCircle(r));
    System.out.println();

    Computer computer = new Computer();
    System.out.println("원면적" + computer.areaCircle(r));
  }
}
