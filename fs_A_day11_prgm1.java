import java.util.Scanner;

// Ramu is given an group of scores and a special number k, 
// Now his teacher asked him to find the pairs(a,b) where a<b such that
// scores[a]-scores[b]==k. 
// The absolute diff should be equal to k 

// If no such pairs exists print 0
// The first line of input contains the size of the scores followed by the scores followed by a special number k 

// input =4
// 4 5 5 4
// 1
// the pairs which match the above condition
// [4 5 5 4]
// The pairs are as follows 
// [4 5]
// [4 5]
// [5 4]
// [5 4]


// input = 5
// 4 3 2 6 5
// 2
// output = 3
// The pairs are as follows 
// [4 2]
// [4 6]
// [3 5]
import java.util.*;
 class fs_A_day11_prgm1 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int special=sc.nextInt();
        System.out.print(get_absolute_diff(n,arr,special));

    }
    static int get_absolute_diff(int N,int[] a,int k)
    {
        int count=0;
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                int diff=Math.abs(a[i]-a[j]);
                if(diff==k)
                {
                    count++;
                }
            }
        }
        return count;
    }
    
}
