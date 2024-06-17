package EST_java.day11.ex4;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> tBox = new Box<>();
        tBox.set(t);
        return tBox;
    }
}
