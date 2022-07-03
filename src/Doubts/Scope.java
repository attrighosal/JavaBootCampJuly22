package Doubts;

public class Scope {

  public static void main(String[] args) {
    int i=0;
    for(i=0; i<10; i++) {
      System.out.println(i);
    }
    System.out.println(i);

    for (int j=0; j<10; j++) {
      System.out.println(j);
    }
    createCar();
    //
    //
  }

  public static void createCar() {
    SUV suv = new SUV(4,5,6,"Blue", 8);
    suv.accelerateSUV(5);
    print();
  }

  public static void print() {

  }

  public static void main(String args[], int x) {

  }
}
// static -> static     V
// non-static -> static V
// static -> non-static X
// non-static -> non-static V
