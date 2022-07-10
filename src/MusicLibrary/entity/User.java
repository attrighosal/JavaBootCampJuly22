package MusicLibrary.entity;

import java.util.Date;

public class User {

  private static Long count = 1L;

  private Long id;
  private String firstName;
  private String lastName;
  private Contact contact;
  private Address address;
  private final Date registrationTime;

  public User(String firstName, String lastName, Contact contact, Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.contact = contact;
    this.address = address;
    this.registrationTime = new Date();
    this.id = count;
    count++;
  }

  public Long getId() {
    return id;
  }

  public String toString() {
    return "User id : "+id+", name : "+firstName+" "+lastName;
  }
}
