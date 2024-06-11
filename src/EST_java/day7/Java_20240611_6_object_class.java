package EST_java.day7;

public class Java_20240611_6_object_class {
    String name;
    int phoneNumber;
    int age;
    int money;

    // 생성자
    public Java_20240611_6_object_class(String name, int phoneNumber, int age, int money){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.money = money;
    }

    public void sayHello(){
        System.out.println("Hello, " + name + " how are you?");
    }

    public void sayMoney(){
        System.out.println(name + "님이 가지고 있는 돈은: " + money + "원 입니다.");
    }

    public void teaching (Java_20240611_7_student student) {
        student.levelUp();
    }

    public void cheating (Java_20240611_7_student student) {
        student.levelDown();
    }

}
