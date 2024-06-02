package EST_java.day3;

public class Java_20240531_13_insert {
  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.insert(0, "World");
    sb.insert(6, "2");
    sb.insert(1, "3");
    sb.insert(10, "4");

    System.out.println(sb);
  }
}