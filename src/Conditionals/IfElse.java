package Conditionals;

import java.util.Scanner;

public class IfElse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age : ");
    int age = sc.nextInt();
    if (age>=18) {
      System.out.println("Adult");
    }
    else {
      System.out.println("Not Adult");
    }
    System.out.println("Ends here");
  }
}
