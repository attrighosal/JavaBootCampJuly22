package Lambda;

public class Source2 {

  public static void display(Car car) {
    car.display();
  }

  public static void main(String[] args) {
    Fortuner fortuner = new Fortuner();
    Ertiga ertiga = new Ertiga();

    display(fortuner);
    fortuner.accelerate(50);
  }
}
