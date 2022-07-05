package StringManipulation;

public class Basics {

  public static void main(String[] args) {
    String s = "Hello World!!";
    for (int i=0; i<s.length(); i++) {
      System.out.println(s.charAt(i));
    }

    // Concatenation
    String a = "Hello World!!";
    String b = "Today we are learning Java Strings!!";
    System.out.println(a+" "+b);

    // Concatenating integers
    String c = "Hi ";
    int i = 10;
    int j = 11;
    System.out.println(c+i); // 10 -> "10"
    System.out.println(c+j);
    System.out.println(c+i+" "+j);
    System.out.println(c+i+j); // "Hi "+10 = "Hi 10"+11 = "Hi 1011"
    System.out.println(i+j+c); // 10+11 = 21 + "Hi " = "21Hi "
  }
}
