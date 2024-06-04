package EST_java.day5;

public class Java_20240604_19_for_more2 {
  public static void main(String[] args) {

    int[] scores = {1,30,20,80,15,20,30,22};

    int sum = 0;
    int avg = 0;

    for (int i : scores) {
      sum += i;
    }
    avg = sum / scores.length;

    System.out.println("합계: " + sum);
    System.out.println("평균: " + avg);
  }
}
