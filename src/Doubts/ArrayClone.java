package Doubts;

import java.util.Arrays;

public class ArrayClone {

  public static void main(String[] args) {
    int[] array = new int[] {1,2,3};   // m1 -> [1,2,3]
    int[] arrayClone = array.clone();  // m2 -> [1,2,3]

    System.out.println(Arrays.equals(array, arrayClone));
  }
}
