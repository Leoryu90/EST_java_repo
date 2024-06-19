package EST_java.day13.ex1;

import java.util.*;

public class Java_20240619_set5 {
  public static void main(String[] args) {
    Map<Student, Integer> studentIntegerMap = new HashMap<>();

    studentIntegerMap.put(new Student(50, "홍길동"), 95);
    studentIntegerMap.put(new Student(50, "홍길동"), 95);

    System.out.println(studentIntegerMap.size());

    Set<Map.Entry<Student, Integer>> entries = studentIntegerMap.entrySet();

    for (Map.Entry<Student, Integer> entry : entries) {
      String name = entry.getKey().getName();
      int no = entry.getKey().getNo();
      Integer value = entry.getValue();
    }
  }
}
