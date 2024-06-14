package EST_java.day10;

public class Java_20240614_error4 {
  public static void main(String[] args){
      try {
          int[] numbers = {1, 2, 3};
          System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException 발생
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("배열의 인덱스를 벗어났습니다.");
      }
  }
}
