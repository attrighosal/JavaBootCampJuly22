package ArraysDs;

public class TwoDimensionalArray {

  public static void main(String[] args) {
    int[][] array2d = new int[3][3];
    int value=0;
    for (int row=0; row<3; row++) {
      for (int col=0; col<3; col++) {
        array2d[row][col] = value;
        value++;
        array2d[row][col] = 3*row+col;
        System.out.print(array2d[row][col]+" ");
      }
      System.out.println();
    }
  }
}
