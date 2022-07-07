package Doubts;

import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {
    String s1 = "dog";
    String s2 = "god";

    // 1. sort
    char[] sa1 = s1.toCharArray();
    Arrays.sort(sa1); // O(nlogn)
    s1 = new String(sa1);

    char[] sa2 = s2.toCharArray();
    Arrays.sort(sa2); // O(nlogn)
    s2 = new String(sa2);

    boolean isAnagram = s1.equals(s2);

    // 2. Character Frequency
    int[] freq1 = new int[26];
    int[] freq2 = new int[26];

    for(int i=0; i<s1.length(); i++) {
      freq1[s1.charAt(i)-'a']++; // O(n)
    }
    for(int i=0; i<s2.length(); i++) {
      freq2[s2.charAt(i)-'a']++; // O(n)
    }
    System.out.println(Arrays.toString(freq1));
    System.out.println(Arrays.toString(freq2));

    isAnagram = true;
    for(int i=0; i<26; i++) { // O(26)
      if (freq1[i] != freq2[i]) {
        isAnagram = false;
        break;
      }
    }
    System.out.println(isAnagram);

    // Time Complexity = n+n+26 = 2n+26 = 2n = O(n)

  }
  /*
  dog god (d=1, o=1, g=1)
  wolves vowels
  suv tuv


  1. Sort and check equals
  dgo, dgo -> true
  elosvw, elosvw -> true
  suv, tuv -> false
   */
}
