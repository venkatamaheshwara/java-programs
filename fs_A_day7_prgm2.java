
// Ramu is given an array of numbers now he has to check for a super square matrix in the given array.

// A super square matrix is a matrix such that every row sum, every column sum, and both
// diagonal sums are all equal. 

// The integers in the magic square do not have to be distinct. 
// Every 1 x 1 grid is trivially a super square matrix 

// Given an m x n integer grid , return the size (i.e., the side length k ) of the largest super square matrix that can be found
// within this grid.



// Example 1:

// Input = 
// 4 5
// 7 1 4 5 6
// 2 5 1 6 4
// 1 5 4 3 2
// 1 2 7 3 4
// Output: 3

// Explanation: 

// From the above array we have the following super square matrix of size 3 
// 5 1 6 
// 5 4 3
// 2 7 3 



// The largest super square matrix has a size of 3.
// Every row sum, column sum, and diagonal sum of this magic square is equal to 12.
// - Row sums: 5+1+6 = 5+4+3 = 2+7+3 = 12
// - Column sums: 5+5+2 = 1+4+7 = 6+3+3 = 12
// - Diagonal sums: 5+4+3 = 6+4+2 = 12

import java.util.*;
class fs_A_day7_prgm2{
	static int matrix[][];
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		// Get the matrix..
		matrix = new int[m][n];
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++)
				matrix[i][j] = scanner.nextInt();
		

		
		System.out.println(findmagicsquaresize(m, n));
	}

	public static int findmagicsquaresize(int rows, int cols){
		
		int temprowsum=0, tempcolsum=0;								
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++)
				for(int step=(rows-i<cols-j ? rows-i : cols-j); step >=2 && step<rows && step<cols; step--)		
					if((temprowsum = getrowstepsum(i, j, step)) == (tempcolsum = getcolstepsum(i, j, step)))		
						if(temprowsum == getdiagonalstepsum(i, j, step))
							list.add(step);			

		if(list.size()>0){
			Collections.sort(list);		
			return list.get(list.size()-1);			
		}
		
		return 1;				
	}

	
	static int getrowstepsum(int i, int j, int step){
		int sum=0;
	
		for(int m=j; m<(step+j); m++)
			sum+= matrix[i][m];

		return sum;
	}

	static int getcolstepsum(int i, int j, int step){
		int sum=0;
		for(int n=i; n<(step+i); n++)
			sum += matrix[n][j];
		return sum;
	}

	static int getdiagonalstepsum(int i, int j, int step){
		int sum=0;
		for(int temp=0; temp < step; temp++)
			sum += matrix[i++][j++];
	
		return sum;
	}
}
