package StringManipulation;

public class StringBuilderExample {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("abcd");
    sb.append("e");
    sb.append("fgh");
    sb.insert(4, 'p');
    System.out.println(sb.toString());
    System.out.println(sb.length());

    StringBuffer sbf = new StringBuffer("abcd");
  }
}
