// Given an matrix with no duplicate values, return all lucky numbers in the
// matrix.

// A lucky number is an element of the matrix such that, it is the maximum element in its row and minimum in its column.

// ex:
// input =
// 3 3
// 3 7 8
// 9 11 13
// 15 16 17
// output =8
// explanantion: 8 is the only lucky number since it is the maximum number in row and minimum in its column.


// ex2:
// input =
// 3
// 4
// 15 16 17 12
// 9 3 8 7
// 1 10 4 2
// output =-1
// none of the elements in the matrix matches the luckynumber rules. so print -1.

// input =
// 2 2
// 1 2
// 7 8
// output =2
//explanantion: 2 is the only lucky number since it is the maximum number in row and minimum in its column.

import java.util.*;
public class fs_A_day27_prgm2 {
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print(get_min_max_ele(arr,m,n));
    }
    public static int get_min_max_ele(int[][]a,int m,int n)
    {
     int temp=Integer.MIN_VALUE;
     int min=Integer.MAX_VALUE;
    int flag=0;
     for(int i=0;i<m;i++)
     {
         int colind=0;
          temp=Integer.MIN_VALUE;
         for(int j=0;j<n;j++)
         {
             if(a[i][j]>temp)
             {
                 temp=a[i][j];
                 colind=j;
             }
         }
         for(int j=0;j<m;j++)
         {
             if(a[j][colind]<min)
             {
                 min=a[j][colind];
             }
         }
          if(temp==min)
            {
                return temp;
            }
     }
         return -1;
    }
}
