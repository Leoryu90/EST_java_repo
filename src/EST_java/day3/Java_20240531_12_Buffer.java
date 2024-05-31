package EST_java.day3;

public class Java_20240531_12_Buffer {
  public static void main(String[] args) {
    String result = "";

    result += "Hello";
    result += " Java";
    result += " World!";

    System.out.println(result);

    // 간단한 문자는 스트링  더 넣고 하는건 빌더, 버퍼
    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    sb.append(" Java");
    sb.append(" World!");

    System.out.println(sb);

    StringBuffer sb2 = new StringBuffer();
    sb2.append("Hello");
    sb2.append(" Java");
    sb2.append(" World!");

    System.out.println(sb2);
  }
}