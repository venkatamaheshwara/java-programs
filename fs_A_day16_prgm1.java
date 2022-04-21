// Given a sorted array of distinct integers and a target value, 
// return the index if the target is found. 
// If not, return the index where it would be if it were inserted in order.


// Example 1:
// input =4
// 1 3 5 6
// 5
// output =2


// input =4
// 1 3 5 6
// 2
// output =1

import java.util.*;
public class fs_A_day16_prgm1 {
         public static void main(String[]args)
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int tar=sc.nextInt();
            System.out.print(get_index_of_target(arr,tar));
    }
    static int get_index_of_target(int[]a,int target)
    {
        for(int i=0;i<a.length;i++)
        {
            if(target==a[i])
            {
                return i;
            }
            else if(target<a[i])
            {
                return i;
            }
        }
        return a.length;   
    }
}
