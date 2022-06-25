package Conditionals;

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {

    // Take the input year
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year : ");
    int year = sc.nextInt();

    // Output if it's a leap year
    // if the year is a century year check if it's divisible by 400
    // else check if it's divisible by 4
    if (year%100==0) { // Century eg. 100,200,2000,3000
      if (year%400==0) {
        System.out.println("Leap Year");
      }
      else {
        System.out.println("Not a Leap Year");
      }
    }
    else { // Non Century eg. 2022,1050,1947
      if (year%4==0) {
        System.out.println("Leap Year");
      }
      else {
        System.out.println("Not a Leap Year");
      }
    }
    System.out.println(((year%400==0) || (year%100!=0 && year%4==0)) ? "Leap Year" : "Not a Leap Year");
  }
}
