package EST_java.day12.ex6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkList = new LinkedList<>();

        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("arrayList 걸린시간: " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("linkList 걸린시간" + (endTime - startTime));
    }
}
