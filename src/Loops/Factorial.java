package Loops;

public class Factorial {

  public static void main(String[] args) {
    // Find 10 factorial
    // 5! = 1*2*3*4*5 = 120
    // 6! = 1*2*3*4*5*6 = 720
    // 7! = 1*2*3*4*5*6*7 = 5040
    int factorial = 1;
    for(int i=1; i<=10; i++) {
      factorial *= i;
    }
    System.out.println(factorial);
  }
}
