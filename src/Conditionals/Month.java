package Conditionals;

import java.util.Scanner;

public class Month {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the month : ");
    int month = sc.nextInt();

    // for month 1-12 output the month name
    switch (month) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
        // 12 conditions in total
      default:
        System.out.println("Invalid Month");
        break;
    }
  }
}
