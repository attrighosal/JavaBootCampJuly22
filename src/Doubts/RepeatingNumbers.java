package Doubts;

public class RepeatingNumbers {

  public static void main(String[] args) {
    int[] array = new int[] {1,2,3,4,5,6,2};
    boolean found = false;
    for (int i=0; i< array.length; i++){
      for(int j=i+1; j< array.length; j++) {
        if (array[i] == array[j]) {
          System.out.print(array[i]+" ");
          found = true;
          break;
        }
      }
      if (found) {
        break;
      }
    }
  }
}
