package Doubts;

public class PowerCalculation {

  public static void main(String[] args) {
    // 2^8
    int ans = (int)Math.pow(2,8); // 2^y -> O(y)
    System.out.println(ans);

    // left shift operator
    ans = (1<<8); // O(1) (256>>8)
    System.out.println(ans);
    // 01 = 1
    // 010 = 2 (left shift by 1) 2^1
    // 0100 = 4 (left shift by 2) 2^2
    // 01000 = 8 (left shift by 3) 2^3
    // 10000 = 16 (leftshift by 4) 2^4
    // (leftshift by 8) 2^8
    System.out.println((256>>8));

    // x^y -> O(log y)
  }
}
