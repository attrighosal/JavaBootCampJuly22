package Doubts;

import MusicLibrary.entity.Song;

import java.util.Arrays;
import java.util.List;

public class ArrayFor {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    for (int number: list) {
      System.out.println(number);
    }

    for (int i=0; i< list.size(); i++) {
      System.out.println(i + " : " +list.get(i));
    }

    Integer[] array = new Integer[5];
    Song[] songs = new Song[5];
  }
}
