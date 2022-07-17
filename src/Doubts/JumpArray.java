package Doubts;

public class JumpArray {

  public boolean isEndReachable(int[] array, int leap) {
    /*
    Algortihm
     */
    return true;
  }
}

/*
start position = 0
leap = 2
i -> i+1, i-1, i+leap
[0,0,1,0,1,0]
 0 1 2 3 4 5

 0 -> 0+1(possible), 0-1=-1(not possible), 0+2=2(not possible)
 1 -> 1+1=2(not possible) 1-1=0(possible), 1+2=3(possible)
 2 -> not possible
 3 -> 3+1=4(not possible) 3-1=2(not possible) 3+2=5(possible) -> end


size=6, leap=3
[0 0 1 1 1 0]
 0 1 2 3 4 5

 0 -> 0+1=1(possible) 0-1=-1(not possible) 0+3=3(not possible)
 1 -> 1+1=2(not possible) 1-1=0(possible) 1+3=4(not possible)
 2 -> not possible
 3 -> not possible
 4 -> not possible
 5 -> not possible
 */
