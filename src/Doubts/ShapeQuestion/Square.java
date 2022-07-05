package Doubts.ShapeQuestion;

public class Square extends Quadrilateral{

  double length;

  public Square(double length) {
    super(length, length, length, length);
    this.length = length;
  }

  @Override
  protected double getArea() {
    return length*length;
  }
}
