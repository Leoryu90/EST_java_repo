package EST_java.day9.ex7;

public abstract class Animal2 {
    protected String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();
}
