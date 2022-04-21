// You will be given a area of a matrix. Where the matrix has a
// value 1/0. 1 represent the land and 0 represents the water.

// The matrix is connected both row and column wise not diagonally. 
// the matrix is surronded by water completely and there is exactly 1 island (i.e, 1 or more connected land cells)

// The island doesn't have "lakes", meaning the water inside isn't connected to the
// water around the island. One cell is a square with side length 1. The matrix is
// rectangular,. we have to find  perimeter of the island.


// input=4 4
// 0 1 0 0
// 1 1 1 0
// 0 1 0 0
// 1 1 0 0
// output=16

// Explanation- The perimeter is the 16 yellow stripes in the image above.


import java.util.*;
class fs_A_day9_prgm2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]mat=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                    mat[i][j]=sc.nextInt();
        System.out.print(get_perimeter_of_island(mat,r,c));
    }
    public static int get_perimeter_of_island(int [][]m,int row,int col)
    {
        int result=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(m[i][j]==1)
                {
                    int w=4;
                    if(i>0 && m[i-1][j]==1)
                        w-=1;
                    if(i<row-1 && m[i+1][j]==1)
                        w-=1;
                    if(j>0 && m[i][j-1]==1)
                        w-=1;
                    if(j<col-1 && m[i][j+1]==1)
                        w-=1;
                    result+=w;
                    
                }
            }
        }
        return result;
    }
}