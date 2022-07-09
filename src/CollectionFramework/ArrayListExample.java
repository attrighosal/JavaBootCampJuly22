package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>(); // 0
    arrayList.add(1); // size=1, capacity=10
    arrayList.add(2);
    arrayList.remove(0);
    arrayList.add(0, 3);
    System.out.println(arrayList);
    arrayList.addAll(Arrays.asList(1,2,3,4,5,6));
    System.out.println("size : "+arrayList.size());
    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println(arrayList.get(i));
    }
  }
  // [1] -> [1,2] -> [2] -> [3,2]
  // get(0) -> 3
}
