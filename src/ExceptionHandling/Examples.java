package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examples {

  public static int division(int dividend, int divisor) {
    int quotient = dividend/divisor;
    return quotient;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int dividend = sc.nextInt();
      int divisor = sc.nextInt();
      int result = division(dividend,divisor);
      System.out.println("The result of division is : "+result);
    }
    catch (InputMismatchException ex) {
      System.out.println("Invalid input");
    }
    catch (ArithmeticException ex) {
      System.out.println(ex.getMessage());
    }
    catch (Exception ex) {
      System.out.println("Unknown Exception : "+ex.getMessage());
    }
    finally {
      System.out.println("Ending Division");
    }
  }
}
// 1. Arithmetic Exception
// 2. InputMismatch Exception

// UnknownException -> yes
// Car car = new Tata()
// Exception ex = new UnknownException()

// ArithmeticException -> RuntimeException -> Exception