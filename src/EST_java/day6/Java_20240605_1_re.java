package EST_java.day6;

public class Java_20240605_1_re {
  public static void main(String[] args) {
    String[] words = {"apple", "banana", "cherry", "durian"};

    // for문 활용
//    for (int i = 0; i < words.length - 1; i++) {
//      for (int j = i + 1; j < words.length; j++) {
//        System.out.println(words[i] + " " + words[j]);
//      }
//    }

    for (String i : words) {
      for (String j : words) {
        System.out.println(i + " " + j);
      }
    }
  }
}
