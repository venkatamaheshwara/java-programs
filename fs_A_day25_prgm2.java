// Rakesh is playing a game with two arrays called  array1 and array2 of single digit numbers of range 1 to 6.
// In each step rakesh can change any value of any array in range of 1 to 6. 
// return the minimum number of steps to make the sum of values in array1 equal to sum of values in array2
// otherwise print -1, if it is not possible to make the sum of two arrays equal

// Note:  array1 and array2 possibly of different lengths.

// input =6
// 1 2 3 4 5 6
// 6
// 1 1 2 2 2 2
// output =3


// Rakesh can make  the sums of array1 and array2 equal with 3 operations.
// - Change array2[0] to 6. array1 = [1,2,3,4,5,6], array2 = [6,1,2,2,2,2].
// - Change array1[5] to 1. array1 = [1,2,3,4,5,1], array2 = [6,1,2,2,2,2].
// - Change array1[2] to 2. array1 = [1,2,2,4,5,1], array2 = [6,1,2,2,2,2].


// input =7
// 1 1 1 1 1 1 1
// 1
// 6
// output =-1
// Explanation: There is no way to decrease the sum of array1 or to increase the sum of array2 to make them equal.so return -1.


// input =2
// 6 6
// 1
// 1
// output =3
// Explanation: You can make the sums of array1 and array2 equal with 3 operations. All indices are 0-indexed. 
// - Change array1[0] to 2. array1 = [2,6], array2 = [1].
// - Change array1[1] to 2. array1 = [2,2], array2 = [1].
// - Change array2[0] to 4. array1 = [2,2], array2 = [4].



import java.util.*;
public class fs_A_day25_prgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.print(get_equal_sum_in_min_op(arr1,arr2));
        
    }
   public static int get_equal_sum_in_min_op(int[] nums1, int[] nums2) {
        int[] temp1 = new int[7];
        int[] temp2 = new int[7];
        int sum1 = 0;
        int sum2 = 0;

        for (int i : nums1) {
            temp1[i]++;
            sum1 += i;
        }
        for (int i : nums2) {
            temp2[i]++;
            sum2 += i;
        }

        if (sum1 < sum2) {
            int[] temp = temp1;
            temp1 = temp2;
            temp2 = temp;
        }

        int gap = Math.abs(sum1 - sum2);
        int ans = 0;
        for (int i = 1; i < 6; ++i) {
            int available = temp1[7 - i] + temp2[i];
            int close = 6 - i;
            if (gap - close * available <= 0) {
                ans += (gap + close - 1) / close;
                return ans;
            }
            gap -= close * available;
            ans += available;
        }

        return -1;
    }
}
