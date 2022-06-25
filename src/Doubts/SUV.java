package Doubts;

import OOPs.Car;

public class SUV extends Car {

  int airbags;

  public SUV(int tyres, int door, int windows, String color, int airbags) {
    super(tyres, door, windows, color);
    this.airbags = airbags;
  }

  public void accelerateSUV(int speed) {
    this.speed += speed;
  }

  public int getAirbags() {
    return airbags;
  }
}
