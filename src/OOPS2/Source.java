package OOPS2;

public class Source {

  public static void main(String[] args) {
    Car tata = new Tata();
    Car maruti = new Maruti();

    tata.accelerate();
    maruti.accelerate();

    Bus volvo = new Volvo();


    Driver driver = new Driver();

    driver.drive(tata);
    driver.drive(maruti);
    driver.drive(volvo);
  }
}
