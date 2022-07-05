package Doubts.DivideExceptionQuestion;

public class Arithmetic {

  public int divide(int x, int y) throws DivisionNotAllowedException {
    if (x>=y) {
      return x/y;
    }
    throw new DivisionNotAllowedException("Not allowed");
  }
}
