package Doubts.ShapeQuestion;

public abstract class Quadrilateral {

  double side1;
  double side2;
  double side3;
  double side4;

  public Quadrilateral(double side1, double side2, double side3, double side4) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.side4 = side4;
  }

  protected double getPerimeter() {
    return side1+side2+side3+side4;
  }

  protected abstract double getArea();
}
