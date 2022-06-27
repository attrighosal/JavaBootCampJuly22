package OOPS3;

public class Square implements Shape, Draw {

  private int length;

  public Square(int length) {
    this.length = length;
  }

  @Override
  public int area() {
    return length*length;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a square");
  }
}
