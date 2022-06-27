package OOPS3;

public class Rectangle implements Shape, Draw {

  private int length;
  private int breadth;

  public Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  @Override
  public int area() {
    return length*breadth;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a rectangle");
  }
}
