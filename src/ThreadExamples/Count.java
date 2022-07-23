package ThreadExamples;

public class Count extends Thread {

  private int id;
  private int start;
  private int end;

  public Count(int id, int start, int end) {
    this.id = id;
    this.start = start;
    this.end = end;
  }

  public void run() {
    for (int i=start; i<=end; i++) {
      System.out.println("Thread id : "+id+" count : "+i);
    }
  }
}
