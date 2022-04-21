// Given a array of "array of words" and "characters", 
// find the sum of length of all nice words using those characters.

// nice word: a word is nice, if it can be formed by characters.

// example: 

// input =cat bt hat tree
// atach
// output=6

// The words that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

// input =apple orange bat tree
// atbeppol
// output =8

import java.util.*;
public class fs_A_day21_prgm1 {
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[]words=str.split(" ");
        String chars=sc.next();
      //  char[]ch=chars.toCharArray();
        System.out.print(get_nice_word_length(words,chars));
    }
    public static int get_nice_word_length(String[]w,String ch)
    {
        int res=0;
        int ch_arr[]=new int[26];
        char[] ch_temp=ch.toCharArray();
        for(char c:ch_temp)
        {
            ch_arr[c-'a']++;
        }
        for(String word:w)
        {
                if(is_nice_word(word,ch_arr))
                {
                    res+=word.length();
                }
        }
        return res;
    }
    public static boolean is_nice_word(String temp,int[] ch_arr)
    {
       int temp_count[]=new int[26];
       char word_ch[]=temp.toCharArray();
       for(char t:word_ch)
       {
           temp_count[t-'a']++;
       }
       for(int i=0;i<26;i++)
       {
           if(ch_arr[i]-temp_count[i]<0)
           {
               return false;
           }
       }
      return true;
    }
    
}
