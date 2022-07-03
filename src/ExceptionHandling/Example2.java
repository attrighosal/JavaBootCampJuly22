package ExceptionHandling;

public class Example2 {

  public static void main(String[] args) {
    int[] array = new int[5]; //{0,0,0,0,0} (0->4)
    int index = 5;

    // Nested
    try {
      int value = 100/0;
      try {
        array[index] = value;
      }
      catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println(ex.getMessage());
      }
    }
    catch (ArithmeticException ex) {
      System.out.println(ex.getMessage());
    }

    // Flattened
    int dividend = 100;
    int divisor = 0;
    try {
      int value = dividend/divisor;
      array[index] = value;
    }
    catch (ArithmeticException ex) {
      System.out.println(ex.getMessage());
    }
    catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println(ex.getMessage());
    }
    // 1. evaluate 100/0
    // 2. assign it to array[5]
  }
}
/*
try{}
catch(){}
try{}
catch{}

try{}
try{}
catch(){}
catch{}

try {
  try {
  }
  catch(){
  }
}
catch() {
}
 */
