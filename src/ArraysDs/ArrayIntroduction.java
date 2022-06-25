package ArraysDs;

public class ArrayIntroduction {

  public static void main(String[] args) {
    // store 1 to 10
    int[] array = new int[10];
    for (int i=0; i<10; i++) {
      array[i] = i+1;
    }
    for (int i=0; i<10; i++) {
      System.out.println(array[i]);
    }
    array[7] = 100;
    System.out.println(array[7]);
    for (int i=0; i<10; i++) {
      System.out.println(array[i]);
    }
  }
  // 10 = 0,1,2,3,4,5,6,7,8,9
}
