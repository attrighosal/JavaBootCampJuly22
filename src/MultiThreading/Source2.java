package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Source2 implements Runnable {
  private static int counter = 1;
  private static final Object lock = new Object();

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(5);
    for (int i = 0; i < 5; i++) {
      executorService.submit(new Source2());
    }
    executorService.shutdown();
  }
  // [t3 t4 t5 t1 t2]
  // counter = 2
  // print : 1 2

  @Override
  public void run() {
    while (counter <= 100) {
      increment();
    }
  }

  private void increment() {
    synchronized (lock) {
      if(counter <= 100) {
        System.out.println("Counter : " + counter);
        counter++;
      }
    }
  }
}