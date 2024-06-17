package EST_java.day11.ex4;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        Box<Integer> integerBox = new Box<>();
        integerBox.set(6);
        int i = integerBox.get();
    }
}
