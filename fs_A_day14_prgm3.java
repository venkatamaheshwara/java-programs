// you are given an array of integers with positive and negative numbers.

// you should rearrange the elements of integers based on below conditions:
// -- every consecutive pair of integers have alternate signs.
// -- the output array begins with a positive integer.


// example:

// input =6
// 3 1 -2 -5 2 -4
// output =3 -2 1 -5 2 -4


// input = 2
// -1 1
// output =1 -1

import java.util.*;
public class fs_A_day14_prgm3 {
    public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
       // int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[]res=get_alternate_sign_arr(arr,n);
        // get_alternate_sign_arr(arr, n);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    static int[] get_alternate_sign_arr(int[] dup,int n)
    {
        int []temp=new int[n];
        int pos=0,neg=1;
        for(int i=0;i<n;i++)
        {
            if(dup[i]>0)
            {
                temp[pos]=dup[i];
                pos+=2;
            }
            else{
                temp[neg]=dup[i];
                neg+=2;
            }
        }
        return temp;
    }
    // static void get_alternate_sign_arr(int [] a,int n)
    // {
    //     int x=get_index(a);
    //    // System.out.println(a[x]);
    //     for(int i=0; x<n && i<x;x++,i+=2 )
    //     {
    //        // System.out.println(a[x]);
    //         int y=a[i];
    //         a[i]=a[x];
    //         a[x]=y;
    //     }
    // }
    // static int  get_index(int[]b)
    // {
    //     int val=0;
    //     int temp=0;
    //     for(int i=0;i<b.length;i++)
    //     {
    //         if(b[i]<temp)
    //         {
    //             int tem=b[i];
    //             b[i]=b[val];
    //             b[val]=tem;
    //             val++;
    //         }
    //     }
    //     return val;
    // }
       
    
}
    
