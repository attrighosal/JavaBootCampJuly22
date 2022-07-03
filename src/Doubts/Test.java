package Doubts;

public class Test {
  static int x = 11;
  private int y = 33;

  public void method1(int x) {
    Test t2 = new Test();
    this.x = 22;
    y = 44; // t1
    System.out.println(Test.x);
    System.out.println(t2.x);
    System.out.println(t2.y); // t2
    System.out.println(y); // t1
  }

  public static void main(String[] args) {
    Test t1 = new Test();
    t1.method1(5);
  }
}