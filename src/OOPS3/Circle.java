package OOPS3;

public class Circle implements Shape, Draw{

  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }


  @Override
  public int area() {
    return (int)Math.PI*radius*radius;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Circle");
  }
}
