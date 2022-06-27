package OOPS3;

public class ShapeSource {

  public static void drawShape(Draw shape) {
    shape.draw();
  }

  public static void printArea(Shape shape) {
    System.out.println(shape.area());
  }

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(2,3);
    Circle circle = new Circle(2);
    Square square = new Square(5);

    printArea(rectangle);
    printArea(circle);
    printArea(square);
    drawShape(rectangle);
    drawShape(circle);
    drawShape(square);
  }
}
