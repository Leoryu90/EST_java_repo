package EST_java.day7;

public class Java_20240611_5_object {
    public static void main(String[] args) {
        Java_20240611_6_object_class ryu = new Java_20240611_6_object_class("Ryu", 01000000000, 33,500);
        Java_20240611_6_object_class lee = new Java_20240611_6_object_class("Lee", 01000000000, 35,2300);
        Java_20240611_6_object_class kim = new Java_20240611_6_object_class("Kim", 01000000000, 30,5000);
        Java_20240611_6_object_class park = new Java_20240611_6_object_class("Park", 01000000000, 22,1000);
        Java_20240611_7_student student1 = new Java_20240611_7_student();

        ryu.sayHello();
        ryu.sayMoney();
        lee.sayHello();
        lee.sayMoney();
        kim.sayHello();
        kim.sayMoney();
        park.sayHello();
        park.sayMoney();

        ryu.teaching(student1);
        ryu.cheating(student1);
    }
}
