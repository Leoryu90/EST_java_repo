package EST_java.day3;

public class Java_20240531_13_insert {
  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.insert(0, "World");
    sb.insert(0, "World");
    sb.insert(0, "World");
    sb.insert(0, "World");

    System.out.println(sb);
  }
}