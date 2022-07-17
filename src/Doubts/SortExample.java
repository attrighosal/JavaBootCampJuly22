package Doubts;

import java.util.*;

public class SortExample {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int arr[] = new int[size];
    for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
    ArrayList<Integer> list = intoArrayList(arr);
    System.out.println(list);
  }

  public static ArrayList<Integer> intoArrayList(int arr[]) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int element: arr) {
      arrayList.add(element);
    }
    arrayList.sort(Integer::compareTo);
    return arrayList;
  }
  // 4 3 1 5 7
  // 3 4 1 5 7
  // 3 1 4 5 7
  // 1 3 4 5 7
  // two integers and you compared
  // User(id=1, score=5), User(id=2, score=3)
  // Integer(value=2) Integer(value=5)

}
