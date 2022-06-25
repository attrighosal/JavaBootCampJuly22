package Conditionals;

public class AgeBloodGroup {

  public static void main(String[] args) {

    int age = 20;
    String bloodGroup = "O+";
    if (age>=18) {
      switch (bloodGroup) {
        case "O+":
          System.out.println("Adult and Universal Donor");
          break;
        default:
          System.out.println("Adult and Not a Universal Donor");
          break;
      }
    }
    else {
      switch (bloodGroup) {
        case "O+":
          System.out.println("Not an Adult and Universal Donor");
          break;
        default:
          System.out.println("Not an Adult and Not a Universal Donor");
          break;
      }
    }

    switch (bloodGroup) {
      case "O+":
        if (age>=18) {
          System.out.println("Adult and Universal Donor");
        }
        else {
          System.out.println("Not an Adult and Universal Donor");
        }
      default:
        if (age>=18) {
          System.out.println("Adult and Not a Universal Donor");
        }
        else {
          System.out.println("Not an Adult and Not a Universal Donor");
        }
    }
  }
}
