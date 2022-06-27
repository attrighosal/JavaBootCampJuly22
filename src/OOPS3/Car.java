package OOPS3;

public abstract class Car {

  private int registrationNumber;
  private int tyres;
  private static int count=0;

  public Car(int registrationNumber, int tyres) {
    this.registrationNumber = registrationNumber;
    this.tyres = tyres;
    count++;
  }

  public abstract void accelerate();

  public int getRegistrationNumber() {
    return registrationNumber;
  }

  public int getTyres() {
    return tyres;
  }

  public static int getCount() {
    return count;
  }
}
