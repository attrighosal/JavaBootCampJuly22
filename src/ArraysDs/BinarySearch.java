package ArraysDs;

public class BinarySearch {

  public static void main(String[] args) {

    int[] array = new int[] {1,2,4,8,10,15,16}; // 1,2,3,4
    int target = 15;

//    int beg=0, end= array.length-1; // 0,6
    for (int beg=0, end=array.length-1; beg<=end; ) {
      int mid = (beg+end)/2; // 3
      if (array[mid]==target) {
        System.out.println("Found");
        break;
      }
      else if (target<array[mid]) {
        end = mid-1;
      }
      else {
        beg = mid+1;
      }
    }
  }
}
// Binary Search -> O(log n)
// Linear Search -> O(n)
// Unsorted -> sort = O(nlogn)
// Sorting+Binary Search = O(nlogn+logn)

/*
for(int i=1; i<=n; i=i*2) {} -> O(logn)

for(int i=n; i>=1; i=i/2) {} -> O(logn)
i=n  assume = k times
i=n/2
i=n/(2^2)
i=n/(2^3)
i=n/(2^k)

i<n/(2^k)
i=n/(2^k)
1=n/(2^k)
2^k = n
log(2^k) = logn
k = logn
 */

