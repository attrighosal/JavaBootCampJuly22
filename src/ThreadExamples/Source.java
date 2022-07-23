package ThreadExamples;

import MultiThreading.Counter;

public class Source {

  public static void main(String[] args) throws InterruptedException {
    Count count1 = new Count(1,1,50); // new
    Count count2 = new Count(2, 51, 100);
    Count count3 = new Count(3, 101, 150);

    count1.start(); // runnable
    count1.join();
    count2.start();
    // dead
    count2.join();

    count3.start();
  }
}
// 1 to 150
// 1 to 100 -> 51,2,3,5 // parallel
// 101 to 150 -> 101,102,103 // sequential
