package OOPs;

public class Source {

  public static void main(String[] args) {

    Car car1 = new Car(4,4,4,"Blue"); // creation
    Car car2 = new Car(6,4,4,"Blue");

    System.out.println(car1.getTyres());
    System.out.println(car2.getTyres());

    // Steals a door
    //car.setDoor(3); // no -> thief

    // 1. We completely trust the manufacturer
    // 2. We can not trust the thief
  }
}
