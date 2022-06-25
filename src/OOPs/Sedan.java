package OOPs;

public class Sedan extends Car {

  int airbags;

  public Sedan(int tyres, int door,
               int windows, String color, int airbags) {
    super(tyres, door, windows, color);
    this.airbags = airbags;
  }

  public void accelerateSedan(int speed) {
    this.speed += speed;
  }

  public int getAirbags() {
    return airbags;
  }
}
