package EST_java.day8;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello i'm " + name);
    }

    protected void sayWhy() {
    System.out.println("hi");
    }
}
