// Given a matrix with path with cost , find out the maximum total cost to reach.

// initially person at first column but can be at any row.
// he can move to right or right-up  or right-down from that current place.

// example:
// intput =3 3
// 1 3 3
// 2 1 4
// 0 6 4
// output =12

// person will start from (1,0) position cost is 2, and goes to (2,1) cost is 6 and goes to (1,2) or (2,2) cost is 4
// so total cost will be 2+6+4 is 12

// example:
// input =4 4
// 1 3 1 5
// 2 2 4 1
// 5 0 2 3
// 0 6 1 2
// output = 16

// sol1:
// person will start from (2,0) cost will be 5, then goes to (3,1) cost will be 6, then move to (2,2) cost will be 2 
//         and (2,3) cost wil be 3 , so final output would be 5+6+2+3=16

// sol2:
// person will start from (2,0) cost will be 5,(1,1) cost will be 2, then move to (1,2) cost will be 4 and move to (0,3) cost will be 5,
//             so final output would be 5+2+4+5=16



import java.util.*;
public class fs_A_day31_prgm1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] cost_mat=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                cost_mat[i][j]=sc.nextInt();
            }
        }
        System.out.print(get_max_cost(cost_mat,row,col));
    }
    public static int get_max_cost(int [][]mat,int r,int c){
        int max_c=0;
        for(int i=0;i<r;i++)
        {
            int cost=get_cost(mat,i,0,r,c);
            max_c=Math.max(cost,max_c);
        }
        return max_c;
    }
    public static int get_cost(int [][]mat,int i,int j,int m,int n){
        if((i<0) || (i==m) || j==n){
            return 0;
        }
        int right_path=get_cost(mat,i,j+1,m,n);
        int right_upper_diagonal=get_cost(mat,i-1,j+1,m,n);
        int right_lower_diagonal=get_cost(mat,i+1,j+1,m,n);
        return mat[i][j]+Math.max(Math.max(right_upper_diagonal,right_lower_diagonal),right_path);
    }
}
