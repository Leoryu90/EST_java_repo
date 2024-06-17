package EST_java.day11.ex4;

public class Car <T> {
    //Car 클래스를 만드는데 제네릭 형식으로 만든다. 그리고 main에서 String 타입을 가진 인스턴스를 생성하고 get,set 메서드를 호출한다

    private T name;

    public T getName() {
        return name;
    }
    public void setName(T t) {
        this.name = t;
    }
}
