package EST_java.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Java_20240619_set4 {
  public static void main(String[] args) {
    Map<String, Integer> student = new HashMap<>();

    student.put("학생1", 90);
    student.put("학생2", 80);
    student.put("학생3", 70);
    student.put("학생4", 60);
    student.put("유석호", 50);

    System.out.println("유석호:\t" + student.get("유석호"));
    System.out.println();

    Set<Map.Entry<String, Integer>> entrySet = student.entrySet();
    for (Map.Entry<String, Integer> entry : entrySet) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("이름: \t" + key + "\t 점수: \t" + value);
    }

  }
}
