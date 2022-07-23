package LambdaExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachLoop {

  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    // Output : 1,4,9,16,25,36,49,64,81,100
    List<Integer> squares = new ArrayList<>();
    for (int number : arr) {
      squares.add(number*number);
    }
    System.out.println(squares);

    List<Integer> squares2 = new ArrayList<>();
    arr.forEach((x)->squares2.add(x*x));
    System.out.println(squares2);

    List<Integer> squares3 = arr.stream().map(x -> x*x).collect(Collectors.toList());
    System.out.println(squares3);
  }
}

// arr -> stream -> [map] -> collect squares3
