package StringManipulation;

public class Definition {

  public static void main(String[] args) {
    String s1 = "Hello"; // literal definition
    String s2 = new String("Hello"); // object definition
    String s3 = "Hello";

    System.out.println(s1);
    System.out.println(s2);

    // Equality
    System.out.println(s1.equals(s2)); // value check
    System.out.println(s1==s2); // address check
    System.out.println(s1==s3);

    // For primitive use == for equality check
    // For non-primitives/objects use equals()
  }
}
