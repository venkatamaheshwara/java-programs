// Raju is given an Binary rows of numbers(0/1).
// He applies the following rules,
// Rule1-Changing the row [ 1 1 0] will give [ 0 1 1]
// Rule2-Interchange 1-0/0-1

// Apply the above two rules and give raju a new binary rows

// input=3 3
// 1 1 0
// 1 0 1
// 0 0 0
// output=1 0 0
// 0 1 0
// 1 1 1

//The first line of input contains the numbers of the row followed by each individual row size followed by row elements


import java.util.*;
public class fs_A_day15_prgm1 {
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][]arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int[][]res=get_new_binary_rows(arr,m,n);
        for(int i=0;i<m;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] get_new_binary_rows(int a[][],int r,int c)
    {
        int temp[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=c-1;j>=0;j--)
            {
                temp[i][j]=a[i][j];
                 if(temp[i][j]==0)
                {
                    temp[i][j]=1;
                }
                else if(temp[i][j]==1)
                {
                    temp[i][j]=0;
                }
            }
        }
        return temp;
    }
    
}
