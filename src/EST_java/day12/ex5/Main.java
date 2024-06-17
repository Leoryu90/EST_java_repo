package EST_java.day12.ex5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        // String 객체를 저장
        arrayList.add("Java");
        arrayList.add("Spring");
        arrayList.add("Servlet/JSP");
        arrayList.add("DBMS");
        arrayList.add("JPA");

        int size = arrayList.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        String skill = arrayList.get(2);
        System.out.println("Skill 2: " + skill);
        System.out.println();

        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();

        arrayList.remove(2);		// 2번 인덱스(Servlet/JSP) 삭제
        arrayList.remove(2);		// 2번 인덱스(DBMS) 삭제
        arrayList.remove("Java");

        for (int i = 0; i < arrayList.size(); i++) {		// 저장된 총 객체 수만큼 루핑
            String str = arrayList.get(i);
            System.out.println(i + ": " + str);
        }

    }
}
