package MultiThreading;

public class OddEven {
  static int counter = 1;


  public void printOddNumber() {

    while (counter < 100) {
      while ((counter & 1) == 1) { // 2
        System.out.println(counter);// 1
        counter++;
      }
    }
  }
  public void printEvenNumber () {
    while (counter<=100){
      while ((counter & 1) == 0) {
        System.out.println(counter); // 1
        counter++;
      }
    }
  }
  public static void main(String[] args) {
    OddEven mt = new OddEven();
    Thread t1 = new Thread(mt::printOddNumber);
    Thread t2 = new Thread(mt::printEvenNumber);

    t1.start();
    t2.start();
  }
}