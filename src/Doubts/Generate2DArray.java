package Doubts;

import java.util.Arrays;
import java.util.Scanner;

public class Generate2DArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y= sc.nextInt();
    double[][]  matrix = new double[x][y];
    for(int i=0; i<x; i++) {
      for (int j = 0; j < y; j++) {
        matrix[i][j] = ((double)i + j) / 2;
      }
      System.out.println(Arrays.toString(matrix[i]));
    }
  }
}
