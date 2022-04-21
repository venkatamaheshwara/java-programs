
// Shankar is given a set of N pluck cards, each card labelled with a number on it, and he is also given a difference value as ‘D’.
// Now Shankar has to find out the length of the largest arithmetic set ‘S’.

// A subset is called as arithmetic set, iff the difference between the numbers on any two adjacent cards is same as D.

// A subset can be derived from the set of N pluck cads by deleting some or no cards without changing the order of the remaining cards.

// Input Format:
// ------------- 
// Line-1: Two space separated integers N, D, number of cards, difference.
// Line-2: N space separated integers, numbers on the set of cards.

// Output Format:
// --------------
// Print an integer, length of longest arithmetic subset.


// input=6 2
// 1 2 3 4 6 8
// output=4

// Input=8 -2
// 8 1 2 6 5 4 2 0 
// output=5

import java.util.*;
class fs_A_day10_prgm2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int diff=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(get_length_of_largest_arithmetic_set(n,diff,arr));
        

    }
    public static int get_length_of_largest_arithmetic_set(int num,int d,int []a)
    {
        HashMap<Integer,Integer>arithmetic_set=new HashMap<>();
        int length=0;
        for(int i=0;i<num;i++)
        {
            int prevnum=a[i]-d;
            int len =arithmetic_set.getOrDefault(prevnum, 0);

            arithmetic_set.put(a[i],len+1);
            length=Math.max(length,len+1);
        }
        
        // for(int res:subset)
        // {
        //     //System.out.print(res);
        //     if(res%d==0)
        //     {
        //         count++;
        //     }
        // }
        return length;
    }
}
