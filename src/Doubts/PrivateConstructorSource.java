package Doubts;

public class PrivateConstructorSource {

  public static void main(String[] args) {

    // Player 1
    Singleton singleton1 = Singleton.getInstance();

    // Player 2
    Singleton singleton2 = Singleton.getInstance();
  }
}
