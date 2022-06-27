package OOPS3;

public class OuterClass {

  public OuterClass() {
    System.out.println("Constructor of Outer Class Called");
  }

  public class InnerClass {
    public InnerClass() {
      System.out.println("Constructor of Inner Class Called");
    }
  }

  public static class StaticInnerClass {
    public StaticInnerClass() {
      System.out.println("Constructor of Static Inner Class Called");
    }
  }
}
