package StringManipulation;

import java.util.Arrays;

public class CharacterCount {

  public static int convert(char c) {
    return c-'a';
  }

  public static char unconvert(int index) {
    return (char)(index+97);
  }

  public static void main(String[] args) {
    String s = "helloworld";

    int[] count = new int[26];
    for (int i=0; i<s.length(); i++) {
      char c = s.charAt(i);
      int index = convert(c);
      count[index]++;
    }
    System.out.println(Arrays.toString(count));
    int maxCount = 0, maxIndex=-1;
    for(int i=0; i<26; i++) {
      if (count[i]>maxCount) {
        maxCount = count[i];
        maxIndex = i;
      }
    }
    char c = unconvert(maxIndex);
    System.out.println("Max occurring character : "+c);
  }
}
