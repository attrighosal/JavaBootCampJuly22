package Doubts;

public class FootballScores {

  public static int getScore(String[] scores) {
    int xScore=0;
    for(String score: scores) {
      char x = score.charAt(0);
      char y = score.charAt(2);
      if (x>y) {
        xScore += 3;
      }
      else if (x==y) {
        xScore++;
      }
    }
    return xScore;
  }

  public static void main(String[] args) {
    String[] scores =  new String[]{"3:1", "2:2","0:1","4:0"};
    int score = getScore(scores);
    System.out.println(score);
  }
}
