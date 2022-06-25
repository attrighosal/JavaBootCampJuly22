package Conditionals;

import java.util.Scanner;

public class Marks {

  public static void main(String[] args) {

    // Take an input marks
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks : ");
    int marks = sc.nextInt();

    // Evaluate the grade from the marks
    // 91-100 O
    // 81-90 A+
    // 71-80 A
    // 61-70 B+
    // 51-60 B
    // 41-50 C
    // 31-40 D
    // <=30  F
    if (marks<=100 && marks>90) {
      System.out.println("O");
    }
    else if (marks<=90 && marks>80) {
      System.out.println("A+");
    }
    else if (marks<=80 && marks>70) {
      System.out.println("A");
    }
    else if (marks<=70 && marks>60) {
      System.out.println("B+");
    }
    else if (marks<=60 && marks>50) {
      System.out.println("B");
    }
    else if (marks<=50 && marks>40) {
      System.out.println("C");
    }
    else if (marks<=40 && marks>30) {
      System.out.println("D");
    }
    else {
      System.out.println("F");
    }
  }
}
