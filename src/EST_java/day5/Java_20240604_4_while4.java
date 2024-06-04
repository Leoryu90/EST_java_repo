package EST_java.day5;

public class Java_20240604_4_while4 {
    public static void main(String[] args){
        int[] num = {5,2,9,1,7,4,6,3,8};
        int sum = 0;
        int avg = 0;
        int i = 0;

        while(i < num.length){
            sum += num[i];
            i++;
        }

        avg = sum/num.length;

        System.out.println(avg);
    }
}
