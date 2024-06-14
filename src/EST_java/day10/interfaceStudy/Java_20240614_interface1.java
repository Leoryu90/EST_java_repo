package EST_java.day10.interfaceStudy;

public class Java_20240614_interface1 {
  public static void main(String[] args) {
    ZooKeeper zooKeeper = new ZooKeeper();

    Tiger tiger = new Tiger();
    zooKeeper.feed(tiger);

    Lion lion = new Lion();
    zooKeeper.feed(lion);


  }
}
