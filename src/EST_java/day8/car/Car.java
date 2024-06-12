package EST_java.day8.car;

public class Car {

  private int speed;
  private int gear;

  private String wheel;
  private int cc;
  private String logo;
  private String engine;

  public void setGear(int gear) {
    this.gear = gear;
  }

  public void setWheel(String wheel) {
    this.wheel = wheel;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public void setSpeed(int speed) {
    if (speed < 0) {
      this.speed = 0;
    } else {
      this.speed = speed;
    }

    if (this.speed <= 30) {
      this.gear = 1;
      System.out.println("속도가 " + this.speed + "Km/h 입니다.");
      System.out.println("기어를 " + this.gear + "로 변경합니다.");
    } else if (this.speed <= 70) {
      this.gear = 2;
      System.out.println("속도가 " + this.speed + "Km/h 입니다.");
      System.out.println("기어를 " + this.gear + "로 변경합니다.");
    } else if (this.speed <= 120) {
      this.gear = 3;
      System.out.println("속도가 " + this.speed + "Km/h 입니다.");
      System.out.println("기어를 " + this.gear + "로 변경합니다.");
    } else {
      this.gear = 4;
      System.out.println("속도가 " + this.speed + "Km/h 입니다.");
      System.out.println("기어를 " + this.gear + "로 변경합니다.");
    }
  }

  public void checkSpeed() {
    System.out.println(this.speed);
  }
}
