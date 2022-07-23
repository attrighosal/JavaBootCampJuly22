package Doubts;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(10, "Messi");
    map.put(7, "Ronaldo");
    map.put(11, "Neymar");

    for (Map.Entry<Integer, String> entry: map.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }

    map.forEach((key, value) -> System.out.println(key + " " + value));
  }
}
