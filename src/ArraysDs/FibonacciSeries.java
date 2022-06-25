package ArraysDs;

import java.util.Scanner;

public class FibonacciSeries {

  public static void main(String[] args) {
    // 0 1 1 2 3 5 8 13 21 ......
    // 0 1 1 2 3 5 8 13 21 ......
    // Create a fibonacci array of user input size n

    // Take n as input (3<=n<=1000000)
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // Fibonacci array
    int[] fibonacci = new int[n];
    fibonacci[0] = 0;
    fibonacci[1] = 1;
    // index 2 = index 1 + index 0
    // index 3 = index 2 + index 1
    for(int i=2; i<n; i++) {
      fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
    }

    // Print
    for (int i=0; i<n; i++) {
      System.out.println(fibonacci[i]);
    }
  }
}
