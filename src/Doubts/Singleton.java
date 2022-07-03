package Doubts;

public class Singleton {

  private static Singleton instance;

  private Singleton() {

  }

  public static Singleton getInstance() { // player 4
    if (instance==null) {
      instance = new Singleton();
    }
    return instance;
  }
}
