package Doubts;

import java.util.Arrays;

public class BinarySearch {

  public static void main(String[] args) {
    int[] array = new int[]{10, 15, 20, 22, 35};
    int key = 22;
    int index = Arrays.binarySearch(array, 1, 4, key);
    System.out.println(index);
  }
  // [1,3) -> [1,2]
  // [1,4) -> [1,3]
}
