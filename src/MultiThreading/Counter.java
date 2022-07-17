package MultiThreading;

public class Counter extends Thread{

  private int id;
  private int start;
  private int end;

  public Counter(int id, int start, int end) {
    this.id = id;
    this.start = start;
    this.end = end;
  }

  @Override
  public void run() {
    for (int i=start; i<=end; i++) {
      System.out.println("id="+id+", count="+i);
    }
  }
}
