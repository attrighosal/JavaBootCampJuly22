package OOPS3;

public class InnerClassSource {

  public static void main(String[] args) {
    OuterClass outer = new OuterClass();
    OuterClass.InnerClass inner = outer.new InnerClass();

    OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
  }
}
