package CollectionFramework;

public class Car {
  private int numberId;
  private String brand;

  public Car(int numberId, String brand) {
    this.numberId = numberId;
    this.brand = brand;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(numberId);
  }

  public boolean equals(Car other) {
    return numberId == other.numberId && brand.equals(other.brand);
  }
}
