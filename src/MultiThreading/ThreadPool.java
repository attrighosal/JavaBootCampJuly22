package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

  public static void main(String[] args) {
    ExecutorService service = Executors.newFixedThreadPool(2);

    for (int i=0; i<10; i++) {
      final int x = i;
      service.submit(()->count(x, 1, 10));
    }

  }

  public static void count(int id, int start, int end) {
    for(int i=start; i<=end; i++) {
      System.out.println("id : "+id+", count : "+i);
    }
  }
}
// t1-task1 t2-task4 t3-task5
/*
task 0 is complete
task 1 is complete
task 2 is complete
id : 3, count : 1
id : 3, count : 2
id : 3, count : 3
id : 4, count : 1 task3 and task4
id : 4, count : 2
id : 4, count : 3
id : 4, count : 4
id : 4, count : 5
id : 4, count : 6
id : 4, count : 7
id : 4, count : 8
id : 4, count : 9
id : 4, count : 10 task4 ends task 3
id : 3, count : 4
id : 5, count : 1 task 5 starts task3 active
id : 5, count : 2
 */

/*
1 - 11
2 - 100
3 - 4
4 - 120
5 - 10

[{1,11},{2,100},{3,4},{4,120},{5,10}]

[{4,120},{2,100},{1,11},{5,10},{3,4}]

list<Map.Entry<Integer, Integer>> -> sort
 */
