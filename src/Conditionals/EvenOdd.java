package Conditionals;

public class EvenOdd {

  public static void main(String[] args) {
    int number = 9;

    if ((number&1)==0) {
      System.out.println("Even");
      //
    }
    else {
      System.out.println("Odd");
      //
    }

    System.out.println(number%2==0 ? "Even" : "Odd");
  }
}
