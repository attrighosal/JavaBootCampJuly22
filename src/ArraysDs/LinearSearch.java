package ArraysDs;

public class LinearSearch {

  public static void main(String[] args) {
    int[] array = new int[] {5,1,2,3,4,8,7};
    int target = 7;

    for (int i=0; i< array.length; i++) {
      if (array[i]==target) {
        System.out.println(target+" found");
        break;
      }
    }
  }
}
