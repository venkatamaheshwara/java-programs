// Given a mXn matrix print the matrix in the following format.
// sort the each matrix elements of diagonal in ascending order.

// example:
// input =
// 3
// 3
// 9 6 3
// 8 5 2
// 7 4 1
// output =
// 1 2 3
// 4 5 6
// 7 8 9


// input =
// 3
// 4
// 3 3 1 1
// 2 2 1 2
// 1 1 1 2
// output =
// 1 1 1 1
// 1 2 2 2
// 1 2 3 3

import java.util.*;
public class fs_A_day14_prgm1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int[][] a=new int[row][col];
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    int[][]res=get_sorted_diagnol_elements(a);
   //int[][]res=diagonalSort(a);
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            System.out.print(res[i][j]+" ");
        }
        System.out.println();
    }
    
    }
    static int[][] get_sorted_diagnol_elements(int[][]arr)
    {
        int m=arr.length;
        int n=arr[0].length;
        int x=0,y=n-1;
         while (x < m) {
            int i = x;
            int j = y;

            int[] temp = new int[Math.min(m - i, n - j)];
            int k = 0;

            while (i < m && j < n) {
                temp[k++] = arr[i++][j++];
            }

            Arrays.sort(temp);

            i = x;
            j = y;
            k = 0;

            while (i < m && j < n) {
                arr[i++][j++] = temp[k++];
            }

            if (y == 0) {
                x += 1;
            } 
            else {
                y -= 1;
            }
        }
        return arr;
    }
    // public static int[][] diagonalSort(int[][] mat) {
    //     int m = mat.length;
    //     int n = mat[0].length;

    //     int i0 = 0;
    //     int j0 = n - 1;

    //     while (i0 < m) {
    //         int i = i0;
    //         int j = j0;

    //         int[] arr = new int[Math.min(m - i, n - j)];
    //         int k = 0;

    //         while (i < m && j < n) {
    //             arr[k++] = mat[i++][j++];
    //         }

    //         Arrays.sort(arr);

    //         i = i0;
    //         j = j0;
    //         k = 0;

    //         while (i < m && j < n) {
    //             mat[i++][j++] = arr[k++];
    //         }

    //         if (j0 == 0) {
    //             i0 += 1;
    //         } else {
    //             j0 -= 1;
    //         }
    //     }

    //     return mat;
    // }
    
    
}
