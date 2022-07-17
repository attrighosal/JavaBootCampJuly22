package Doubts;

public class JumpSource {

  public static void main(String[] args) {

    int[] array = {0,0,1,0,1,0};
    int leap = 2;
    JumpArray jumpArray = new JumpArray();
    System.out.println(jumpArray.isEndReachable(array, leap));
  }
}
