package MultiThreading;

public class Synchronization {

  public static void countSynchronized(int id) {
    synchronized (Synchronization.class) {
      for (int i = 1; i <= 100; i++) {
        System.out.println("id : " + id + ", count : " + i);
      }
    }
    System.out.println();
  }

  public synchronized static void countSync(int id) {
    for (int i = 1; i <= 100; i++) {
      System.out.println("id : " + id + ", count : " + i);
    }
  }

  public static void countNormal(int id) {
    for (int i = 1; i <= 100; i++) {
      System.out.println("id : " + id + ", count : " + i);
    }
  }

  public static void main(String[] args) {
//    Thread t1 = new Thread(() -> countSynchronized(1));
//    Thread t2 = new Thread(() -> countSynchronized(2));

    Thread t1 = new Thread(() -> countNormal(1));
    Thread t2 = new Thread(() -> countNormal(2));
    t1.start();
    t2.start();
  }
}

/*
[t3,t4,t5]
[codes] t2
 */
