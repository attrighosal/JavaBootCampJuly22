package Doubts;

public class JumpGame {

  public static void main(String[] args) {
    int[] array = new int[] {1,2,3,5,4};
    int position=0;
    while(position<array.length) {
      position = position+array[position]; // 0+1=1, 1+2=3, 3+5=8, 3+0=3
      if (array[position]==0) {
        System.out.println("Can't reach");
        break;
      }
    }
    if (position>= array.length) {
      System.out.println("Reached end");
    }

    int pos=0;
    for(; pos < array.length; pos += array[pos]) {
      if (array[pos]==0) {
        System.out.println("Can't reach");
        break;
      }
    }
    if (pos>= array.length) {
      System.out.println("Reached end");
    }
  }
}
