package EST_java.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 , 9, 10);

        List<Integer> numEx =
                numbers
                        .stream()
                        .filter(i -> i % 2 == 1)
                        .collect(Collectors.toUnmodifiableList());
        System.out.println(numEx);
    }
}