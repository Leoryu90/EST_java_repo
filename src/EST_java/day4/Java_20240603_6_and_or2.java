package EST_java.day4;

public class Java_20240603_6_and_or2 {
  public static void main(String[] args) {

    int a = 10;
    int b = 5;

    boolean result1 = (a > 5) && (b < 10);
    boolean result2 = (a > 5) || (b > 10);
    boolean result3 = !(a > 5);

    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);
    System.out.println("result3 = " + result3);


    // 문제

    boolean x = true;
    boolean y = false;
    boolean z = true;

    if (x && !y) {System.out.println("조건1 충족");
    }

    if ((y && z) || !(x || z)) {
      System.out.println("조건2 충족");
    }

    if (x || y || z) {
      System.out.println("적어도 하나는 참");
    }

    if (!(x || y || z)) {
      System.out.println("모두 거짓");
    }

  }
}
