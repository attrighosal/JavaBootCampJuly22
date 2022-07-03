package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

  public static int add(int a, int b) {
    return a+b;
  }

  public static void main(String[] args) throws InvalidInputException {
    try {
      Scanner sc = new Scanner(System.in);
      int first = sc.nextInt();
      int second = sc.nextInt();
      System.out.println("Result of Addition : " + add(first, second));
    }
    catch (InputMismatchException ex) {
      throw new InvalidInputException("Calculator accepts only numbers");
    }
  }
}
