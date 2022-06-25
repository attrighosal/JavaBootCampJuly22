package OOPs;

public class Car {

  private int tyres;
  private int door;
  private int windows;
  protected int speed;
  private String color;

  public Car(int tyres, int door, int windows, String color) {
    this.tyres = tyres;
    this.door = door;
    this.windows = windows;
    this.speed = 0;
    this.color = color;
  }

  public void accelerate(int speed) {
    this.speed += speed;
  }

  public int getTyres() {
    return tyres;
  }

  public int getDoor() {
    return door;
  }

  public int getWindows() {
    return windows;
  }

  public int getSpeed() {
    return speed;
  }

  public String getColor() {
    return color;
  }

}
