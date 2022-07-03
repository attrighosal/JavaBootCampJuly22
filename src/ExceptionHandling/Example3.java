package ExceptionHandling;

public class Example3 {

  public static void main(String[] args) {
    try {
      int ans = 100/0;
      System.out.println(ans);
    }
    catch(ArithmeticException ex) {
      System.out.println(ex.getMessage());
    }
    catch (Exception ex) {
      System.out.println("Unknown Exception");
    }
    finally {
      System.out.println("Ending the division");
    }
  }
}
