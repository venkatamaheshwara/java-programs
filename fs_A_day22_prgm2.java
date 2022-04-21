// In a school assembly, the students of class-3 stood in a line in random order of their heights.
// the teacher wants remove few students, so that the line remains in increasing order of their heights.

// help the teacher to print the count of students to be removed from the line.

// Note: the teacher has to remove the continous subsequence.

// example:
// input =8
// 2 3 4 11 5 3 4 6
// output=3

// The shortest subsequence teacher  can remove is [11,5,3] of length 3. 
// The remaining student heights after that will be [2,3,4,4,6].


// Another correct solution is to remove the subsequence [4,11,5].
// The remaining student heights after that will be [2,3,3,4,6].


// input =5
// 5 4 3 2 1
// output =4
// Explanation: Since the heights are strictly decreasing, we can only keep a single student. Therefore we need to remove a subsequence of students count 4, either [5,4,3,2] or [4,3,2,1].



import java.util.*;
public class fs_A_day22_prgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []list=new int[n];
        for(int i=0;i<n;i++)
        {
            list[i]=sc.nextInt();
        }
        System.out.print(get_count(list));
    }
    public static int get_count(int[]arr)
    {
        
        
        int n = arr.length;
        int left = 0;
        int right = n-1;
        
        while (left < n-1 && arr[left] <= arr[left+1]) left++;
        if (left == n-1) return 0;
        
        while (right >= left && arr[right] >= arr[right-1]) right--;
        if (right == 0) return n-1;
        
        int result = Math.min(n-1-left, right);
        
        int i=0;
        int j = right;
        
        while (i <= left && j < n){
            if (arr[j] >= arr[i]){
                result = Math.min(result, j-i-1);
                i++;
            }
            else{
                j++;
            }
        }
        return result;
    }
}
