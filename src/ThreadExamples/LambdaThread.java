package ThreadExamples;

public class LambdaThread {

  public static void main(String[] args) {
    Thread t1 = new Thread(()->count(1, 1, 50));
    Thread t2 = new Thread(()->count(2, 51, 100));

    t1.start();
    t2.start();
  }

  public static void count(int id, int start, int end) {
    for (int i=start; i<=end; i++) {
      System.out.println("Thread id : "+id+" count : "+i);
    }
  }
}

