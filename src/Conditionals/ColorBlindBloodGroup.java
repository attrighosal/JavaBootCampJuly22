package Conditionals;

public class ColorBlindBloodGroup {

  public static void main(String[] args) {

    String isColorBlind = "true";
    String bloodGroup = "O+";

    switch (isColorBlind) {
      case "true":
        switch (bloodGroup) {
          case "O+":
            System.out.println("Color Blind and Universal Donor");
            break;
          default:
            System.out.println("Color Blind and Not a Universal Donor");
            break;
        }
        break;
      case "false":
          switch (bloodGroup) {
            case "O+":
              System.out.println("Not Color Blind and Universal Donor");
              break;
            default:
              System.out.println("Not Color Blind and Not a Universal Donor");
              break;
          }
          break;
      default:
        System.out.println("Invalid Status for color blind");
        break;
    }
  }
}
