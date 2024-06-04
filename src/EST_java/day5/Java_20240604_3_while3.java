package EST_java.day5;

import java.util.stream.IntStream;

public class Java_20240604_3_while3 {
    public static void main(String[] args){
        int i=1;
        int sum=0;

        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);


        //  추가 방법
        int sum2 = IntStream.rangeClosed(1, 100).sum();

        System.out.println(sum2);
    }
}
