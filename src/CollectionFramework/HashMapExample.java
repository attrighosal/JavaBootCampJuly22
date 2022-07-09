package CollectionFramework;

import java.util.HashMap;

public class HashMapExample {

  public static void main(String[] args) {
    HashMap<Integer, String> hashMap = new HashMap<>();
    hashMap.put(10, "Messi");
    hashMap.put(7, "Ronaldo");
    hashMap.put(11, "Neymar");
    hashMap.put(7, "Cavani");
    System.out.println(hashMap);
    System.out.println(hashMap.get(10));

    HashMap<Car, String> hashCar = new HashMap<>();
    hashCar.put(new Car(1, "tata"), "tata");
    hashCar.put(new Car(1, "tata"), "tata");

    System.out.println(hashCar);
  }
}
