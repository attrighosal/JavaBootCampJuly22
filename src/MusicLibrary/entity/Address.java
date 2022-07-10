package MusicLibrary.entity;

public class Address {

  private String city;
  private String locality;
  private String state;
  private Integer pinCode;

  public Address(String city, String locality, String state, Integer pinCode) {
    this.city = city;
    this.locality = locality;
    this.state = state;
    this.pinCode = pinCode;
  }
}
