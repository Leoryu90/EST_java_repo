package EST_java.day8;

public class Test {
    public static void main(String[] args){
        Person person1 = new Person("석호", 33);
        Person person2 = new Person("Min", 20);

        person1.sayHello();

        person2.sayHello();

        person1.sayWhy();
    }
}
