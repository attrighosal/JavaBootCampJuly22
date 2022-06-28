package Doubts;

public class StaticSource {

  public static void main(String[] args) {
    System.out.println(Adder.add(5,6));
    System.out.println(MultiplyAdder.add(5,6));
  }

  public static int main(String[] args, int x) {
    return 1;
  }
}
