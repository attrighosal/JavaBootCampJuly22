package Lambda;

public class Fortuner implements Car{

  @Override
  public void display() {
    System.out.println("Hey There!! I'm a Fortuner");
  }

  public void accelerate(int speed) {
    System.out.println("Accelerating by speed "+speed);
  }

  public static void increaseSpeed(int speed) {
    System.out.println("Accelerating by speed "+speed);
  }
}
