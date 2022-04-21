// Given a word w, return the number of substrings with out duplicate characters of length 3 in w.

// ex: 
// input =xyzzaz
// output =1
// there are 4 substrings of size 3
// xyz, yzz,zza,zaz
// out of this only xyz has no duplicate characters so print 1.


// ex:
// input =aababcabc
// ouput =4

// there are 7 substrings of size 3
// aab,aba,bab,abc,bca,cab,abc
// from the above abc,bca,cab,abc are having unique characters.

import java.util.*;
public class fs_A_day21_prgm2 {
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(get_num_of_substr_without_dup(str));
    }
    public static int get_num_of_substr_without_dup(String s)
    {
        int count=0;
        int k=3;
        for(int i=0;i<s.length();i++)
        {
           
                String temp=s.substring(i,k);
                if(is_not_duplicate(temp))
                {
                    System.out.println(temp);
                    count++;
                    
                }
                if(k==s.length())
                 {
                    break;
                 }
                 else
                {
                    k++;
                }
        }
        return count;
    }
    public static boolean is_not_duplicate(String word)
    {
        int [] ch=new int[26];
        for(char c:word.toCharArray())
        {
            ch[c-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(ch[i]>1)
            {
                return false;
            }
        }
        return true;
    }
}
