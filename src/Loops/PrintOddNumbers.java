package Loops;

public class PrintOddNumbers {

  public static void main(String[] args) {
    // Print all the odd numbers between 1 and 100
    // 1 3 5 7 9 11 13 15 17 19 .......
    // 1. Loop over all the numbers from 1 to 100, check if odd and print
    for (int i=1; i<=100; i++) { // 1,2,3,4,5,6,7,8,9
      if (i%2==1) { // (i&1)==1
        System.out.println(i);
      }
    }
    // 2. Loop over all the odd elements
    for (int i=1; i<=100; i+=2) { // 1,3,5,7,9
      System.out.println(i);
    }
  }
}
