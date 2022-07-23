package OOPS3;

public class Circle implements Shape, Draw{

  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }


  @Override
  public int area() {
    return (int)Math.PI*radius*radius;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Circle");
  }
}
/*
6 cores
intellij 10
chrome 20
docker 15
java 1000 independent parallel tasks - 10 threads
t1 t2 t3
jvm scheduler
task1 task2 task3 task4 task5 task queue

 */
