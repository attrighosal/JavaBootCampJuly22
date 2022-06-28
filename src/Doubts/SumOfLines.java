package Doubts;

public class SumOfLines {

  private static int getTotalSumOfLines(Line firstLine, Line secondLine) {

    return Math.abs(firstLine.b - firstLine.a)+Math.abs(secondLine.b - secondLine.a);
  }

  public static void main(String[] args) {
    Line firstLine = new Line(-3, 10);
    Line secondLine = new Line(9,5);
  }
}
