package Doubts;

public class AddString {

  public int Add(String s) {
    int sum = 0;
    for (int i=0; i<s.length(); i++) {
      char c = s.charAt(i);
      if (c>='0' && c<='9') {
        sum += c-'0';
      }
    }
    return sum;
  }

  public int AddNumbers(String s) {
    int sum=0, number=0;
    for (int i=0; i<s.length(); i++) {
      char c = s.charAt(i);
      if (c>='0' && c<='9') { //"123ab145" number=0
        int digit = c-'0'; // c(ASCII)-'a'(ASCII)
        number = number*10+digit; // number = 145
      }
      else {
        sum += number; // sum = 123
        number = 0;
      }
    }
    sum += number;// 123+145 = 268
    return sum;
  }

  public static void main(String[] args) {
    AddString addString = new AddString();
    int ans = addString.AddNumbers("1a23bc1245");
    System.out.println(ans);
  }
}
