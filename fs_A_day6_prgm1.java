
// Gopal is given a string s, Now he has to remove duplicate letters so that every letter appears once and only once.

// He must make sure that the result produces should occur in the order given in string 

// Example 1:

// Input = bcabc
// Output = bca

import java.util.*;
public class fs_A_day6_prgm1 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        remove_duplicate_letters(str);
    }
    public static void  remove_duplicate_letters(String s)
     {
         String res="";
         LinkedHashSet<Character>ls=new LinkedHashSet<>();
         for(char ch:s.toCharArray())
         {
                ls.add(ch);
         }
         for(char ch:ls)
         {
            System.out.print(ch);
         }

        
    }
}
