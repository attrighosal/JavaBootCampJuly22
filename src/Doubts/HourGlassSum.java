package Doubts;

public class HourGlassSum {

  public static void main(String[] args) {

    int[][] matrix = new int[][] {
      {1, 1, 1, 0, 0, 0},
      {0, 1, 0, 0, 0, 0},
      {1, 1, 1, 0, 0, 0},
      {0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0}
    };
    // {{items, items,}, item, item, item} -> rows=4 , cols=2

    int rows = matrix.length;
    int cols = matrix[0].length;
    int maxSum=0;

    for (int top=0; top<rows-2; top++) {
      int middle = top+1;
      int bottom = top+2;
      for(int left=0; left<cols-2; left++) {
        int mid = left+1;
        int right = left+2;
        int sum =
            matrix[top][left]+matrix[top][mid]+matrix[top][right]
                              +matrix[middle][mid]
            +matrix[bottom][left]+matrix[bottom][mid]+matrix[bottom][right];
        maxSum = Math.max(maxSum, sum);
      }
    }
    System.out.println(maxSum);
  }
}
/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

3 layers
top layer -> 3 elements
middle layer -> 1 element
bottom layer -> 3 elements
sum = 7
0 1 0
  1
0 0 0
_ _ _
  _
_ _ _
 */
