package Doubts.ShapeQuestion;

public class Rectangle extends Quadrilateral{

  double length;
  double breadth;

  public Rectangle(double length, double breadth) {
    super(length, breadth, length, breadth);
    this.length = length;
    this.breadth = breadth;
  }

  @Override
  protected double getArea() {
    return length*breadth;
  }
}
