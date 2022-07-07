package Doubts;

import java.lang.String;

public class CustomString  {

  String s;

  public char charAt(int index) {
    return s.charAt(index);
  }

  public String addBegin(String s1) {
    s = s1+s;
    return s;
  }

}
