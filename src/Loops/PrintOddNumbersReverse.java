package Loops;

public class PrintOddNumbersReverse {

  public static void main(String[] args) {
    // Print odd numbers between 1 and 100 in reverse order
    // 99,97,95,93,91,....,1
    for (int i=99; i>=1; i-=2) { // 1,3,5,7,9
      System.out.println(i);
    }
  }
}
/*
1
 |
/\
1 1


 */
