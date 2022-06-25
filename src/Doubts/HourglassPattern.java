package Doubts;

public class HourglassPattern {

  public static void main(String[] args) {
    int n = 5;
    // 10*5 2n*n
    for (int i=0; i<n; i++) {
      // Leading blank spaces
      for(int j=0; j<i; j++) {
        System.out.print(" ");
      }

      // stars
      for(int j=0; j<n-i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i=0; i<n; i++) {
      // Leading blank spaces
      for(int j=n-i-1; j>0; j--) {
        System.out.print(" ");
      }

      // stars
      for(int j=0; j<=i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
/*
*| |*| |*| |*| |*| |
 |*| |*| |*| |*| | |
 | |*| |*| |*| | | |
 | | |*| |*|
 | | | |*| |
 */
