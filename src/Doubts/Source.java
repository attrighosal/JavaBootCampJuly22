package Doubts;

import OOPs.Car;

public class Source {

  public static void main(String[] args) {
    //Car car = new Car();

    SUV suv = new SUV(4,4,4, "Green", 8);


    B b = new B();
    A a = new A(b);

    Test t = new Test();
    System.out.println(t.x);
  }
}
