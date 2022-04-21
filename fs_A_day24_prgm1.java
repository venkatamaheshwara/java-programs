// Shyam is playing with group of characters, where the group of characters contain only A/B.

// He has to return the count of non-empty substrings from this group which will have the same number of
// A's and B's and all the A's and all the B's in these substrings are grouped consecutively

// Substrings that occur multiple times are counted the number of times they occur.

 
// Example 1:

// Input = AABBAABB
// Output = 6

// Explanation: 
// There are 6 substrings that have equal number of consecutive B's and A's: 
// "AABB", "AB", "BBAA", "BA", "AABB", and "AB".
// Notice that some of these substrings repeat and are counted the number of times they occur.
// Also, "AABBAABB" is not a valid substring because all the A's (and B's) are not grouped together.

// Example 2:

// Input = BABAB
// Output = 4
// Explanation: 
// There are 4 substrings: "BA", "AB", "BA", "AB" that have equal number of consecutive B's and A's.

import java.util.*;
public class fs_A_day24_prgm1{
        public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(get_count_of_consecutive_AB(str));
    }
    public static int get_count_of_consecutive_AB(String s)
    {
        int count=0;
        int diff_chars=0;
        int same_chars=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                count+=Math.min(diff_chars,same_chars);
                diff_chars=same_chars;
                same_chars=1;
            }
            else
            {
                same_chars++;
            }
            
        }
        
        return count+Math.min(same_chars,diff_chars);
    }
    

}
