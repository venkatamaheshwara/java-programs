//  Given an integer m and array characters, return the maximum number of consecutive B's in the array if you can
// change at most m A's.


// input =11
// B B B A A A B B B B A
// 2
// output=6

// Explanation: B B B A A B B B B B B
// 5th index and 10th index were flipped from A to B. The longest subarray is 5th index to 10th index are having consecutive B's. so return length 6


// input =19
// A A B B A A B B B A B B A A A B B B B
// 3
// output =10
// Explanation: A A B B B B B B B B B B A A A B B B B
// index 4th , 5th and 9th index  were changed from A to B. The longest subarray is from 2nd index to 11th index. so return length 10

import java.util.*;
 public class fs_A_day25_prgm1
 {
  public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] ch=new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
        int m=sc.nextInt();
        System.out.print(get_Max_Bs_Length(ch,m));
    }
    public static int get_Max_Bs_Length(char[]arr,int M)
    {
       int j=-1;
       int max_length=0;
       int start=0;
       int end=0;
       int count=0;
       while(start<arr.length)
       {
          if(arr[start]=='B')count++;
          if(start-end+1-count>M){
            if(arr[end]=='B')
                count--;
            end++;
          }
       max_length=Math.max(max_length,start-end+1);
       start++;
       }
       return max_length;
    }
}