package MultiThreading;

public class Counting {

  public static void main(String[] args) {
    // Print all the numbers from 1 to 100
    Counter counter1 = new Counter(1,1,25); // new
    Counter counter2 = new Counter(2,26,50);
    Counter counter3 = new Counter(3,51,75);
    Counter counter4 = new Counter(4,76,100);

    counter1.start(); // Runnable
    counter2.start();
    counter3.start();
    counter4.start();
  }
}
// Time Complexity = O(n)
