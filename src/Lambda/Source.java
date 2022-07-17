package Lambda;

public class Source {

  public static void main(String[] args) {

    // 1. Concrete Class
    Car fortuner = new Fortuner();
    fortuner.display();

    // 2. Anonymous Class
    Car innova = new Car() {
      @Override
      public void display() {
        System.out.println("Hey There!! I'm an Innova");
      }
    };
    innova.display();

    // 3. Lambda
    Car bmw = () -> {
      System.out.println("Hey I'm bmw!!");
      System.out.println("I'm an example of lambda");
    };
    bmw.display();

    // Lambda with parameters
    Bike bike = (x) -> System.out.println("Accelerating by speed "+x);
    bike.speedUp(50);

    // 4. Reusing already defined instance method
    Fortuner fortuner2 = new Fortuner();
    Bike bike1 = fortuner2::accelerate;
    bike1.speedUp(50);

    // 5. Reusing already defined static method
    Bike bike2 = Fortuner::increaseSpeed;
    bike2.speedUp(50);
  }
}
