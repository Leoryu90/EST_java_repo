package EST_java.day12.ex1;

public class Example1 {
    public static void main(String[] args) {
    System.out.println(compare(10,3));
    System.out.println(compare(3,3));
    System.out.println(compare(1,29));
    compareString("Ryu", "Ryu");
    compareString("RYU1", "Ryu2");
    }

    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2);
    }

    public static <T extends String> void compareString(T t1, T t2) {
        System.out.println(t1.equals(t2) ? "okay" : "no");
    }
}
