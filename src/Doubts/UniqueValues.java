package Doubts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueValues {

  public static void main(String[] args) {
    Map<Integer, Character> map = new HashMap<>();
    map.put(1, 'a');
    map.put(2, 'a');
    map.put(3, 'b');

    Set<Character> uniqueValues = new HashSet<>(map.values());
    System.out.println(uniqueValues);
  }
}
