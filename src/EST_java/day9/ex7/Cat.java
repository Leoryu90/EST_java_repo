package EST_java.day9.ex7;

public class Cat extends Animal2 {

    public Cat() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
    System.out.println("miumiu");
    }
}
