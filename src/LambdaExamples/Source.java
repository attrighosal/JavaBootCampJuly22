package LambdaExamples;

public class Source {

  public static void main(String[] args) {

    // 1. Creating a concrete class
    Car fortuner = new Fortuner();
    fortuner.display();

    // 2. Anonymous Class
    Car car = new Car() {
      @Override
      public void display() {
        System.out.println("Hey There!! I'm an anonymous Car !!");
      }
    };
    car.display();

    // 3. Lambda
    Car lambda = () -> System.out.println("Hey There!! I'm a Lambda Car !!");
    lambda.display();

    // 4. lambda with parameters
    Bike bike = (x) -> {
      System.out.println("Hey There!! I'm a bike");
      System.out.println("Accelerating by speed "+x);
    };
    bike.accelerate(50);
  }
}
