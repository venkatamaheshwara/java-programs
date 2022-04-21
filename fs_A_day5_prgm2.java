
// Sundeep is working with integer sets.
// He is given a set of integers nums[], consist of positive integers.
// You have to find a subsequence of integet set nums[], where the sum of elements
// is equal to the sum of the rest of the elements.

// Check whether you are able to split the entire set nums[], into two subsequences
// where the two subsequences never share the elements from same index.

// If it is possible to split, print true.
// otherwise print false.

// The first line of input contains the size followed by array elements 

// Sample Input-1:
// ---------------
// 4
// 4 2 8 6

// Sample Output-1:
// ----------------
// true

// Explanation:
// ----------
// [4,6] and [2,8] sum of both the sets equal to 10.


// Sample Input-2:
// ---------------
// 5
// 2 3 4 5 8

// Sample Output-2:
// ----------------
//false

import java.util.*;
class fs_A_day5_prgm2 {

  public static boolean canPartition(int[] num) {
    int sum = 0;
    for (int i = 0; i < num.length; i++)
      sum += num[i];

    if (sum % 2 != 0)
      return false;

    Boolean[][] dp = new Boolean[num.length][sum / 2 + 1];
    return Recursive(dp, num, sum / 2, 0);
  }

  public static boolean Recursive(Boolean[][] dp, int[] num, int sum, int currentIndex) {
    // base check
    if (sum == 0)
      return true;

    if (num.length == 0 || currentIndex >= num.length)
      return false;

    if (dp[currentIndex][sum] == null) {
     
      if (num[currentIndex] <= sum) {
        if (Recursive(dp, num, sum - num[currentIndex], currentIndex + 1)) {
          dp[currentIndex][sum] = true;
          return true;
        }
      }

      dp[currentIndex][sum] = Recursive(dp, num, sum, currentIndex + 1);
    }

    return dp[currentIndex][sum];
  }

  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in) ;
   int n=sc.nextInt();
   int[] num = new int[n];
   for(int i=0;i<n;i++)
   {
       num[i]=sc.nextInt();
   }
    System.out.println(canPartition(num));
  }
}

