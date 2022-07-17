package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

  public static void main(String[] args) {
    // Given an arrayList of integers build another arrayList with the
    // squares of the number
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    // output : [4,16,36,64,100]

    // Enhanced For Loop
    List<Integer> squares = new ArrayList<>();
    for (int number: numbers) {
      if ((number&1)==0) { // Even check
        squares.add(number*number);
      }
    }
    System.out.println(squares);

    // For Each Loop
    List<Integer> squares2 = new ArrayList<>();
    numbers.forEach((x) -> {
      if ((x&1)==0) {
        squares2.add(x*x);
      }
    });
    squares2.forEach(System.out::println);

    // Stream
    List<Integer> squares3 = numbers.stream()
        .filter((x)->(x&1)==0)
        .map((x)->x*x)
        .collect(Collectors.toList());
    System.out.println(squares3);
  }
}
// numbers [stream] [filter] |---map----| [filter] [collect] squares
