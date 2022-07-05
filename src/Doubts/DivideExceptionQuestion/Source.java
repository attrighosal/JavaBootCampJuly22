package Doubts.DivideExceptionQuestion;

import java.util.Scanner;

public class Source {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();

    Arithmetic arithmetic = new Arithmetic();
    try {
      System.out.println(arithmetic.divide(x,y));
    }
    catch (Exception e) {
      System.out.println(e.getClass().getName());
    }
  }
}
