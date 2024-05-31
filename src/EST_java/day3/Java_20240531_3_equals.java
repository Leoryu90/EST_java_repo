package EST_java.day3;

public class Java_20240531_3_equals {
  public static void main(String[] args) {
    String a = "hello";
    String b = new String("hello");

    System.out.println(a.equals(b));
    System.out.println(a == b);

    char c1 = 'a';
    char c2 = 'a';

    System.out.println(c1 == c2);
  }
}
