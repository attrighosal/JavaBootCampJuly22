package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Source implements Runnable {

  private static int counter = 1;

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(5);
    for (int i = 0; i < 5; i++) {
      executorService.submit(new Source());
      break;
    }
    executorService.shutdown();
  }
  public void run() {
    while (counter <= 100) {
      increment();
    }
  }

  private void increment() {
    System.out.println("Counter : " + counter);
    counter++;
  }


}