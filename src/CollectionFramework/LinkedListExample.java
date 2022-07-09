package CollectionFramework;

import java.util.LinkedList;

public class LinkedListExample {

  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5); // [1,2,3,4,5]
    linkedList.removeFirst(); // [2,3,4,5]
    linkedList.removeLast(); // [2,3,4]
    linkedList.remove(1); // [2,4]
    System.out.println(linkedList);
    System.out.println("size : "+linkedList.size());
    for (int i=0; i< linkedList.size(); i++) {
      System.out.println(linkedList.get(i));
    }
  }
}
