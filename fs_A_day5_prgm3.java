
// Shanmukha creating a special strings.
// A string is said to be a special string, if all the letters appeared 
// even number of times, or only one letter appeared odd number of times.

// For example: "adda" and "iaaff" are special strings.
// but "iaf" is not a special string.

// You are given a word W, where W conatins the letters from a to j.
// Our task is to findout, the number of non-empty special strings, 
// which are substrings of word W can be formed.
// if a substring appeared more than once, count each appearance separately.

// NOTE: subsequences are not allowed.

// Input Format:
// -------------
// A String W, the word.

// Output Format:
// --------------
// Print an integer, number of special strings.


// Sample Input-1:
// ---------------
// egg

// Sample Output-1:
// ----------------
// 5

// Explanation:
// ------------
// The special strings formed from the word "egg" are:
// 'e'gg, e'g'g, eg'g', e'gg', 'egg'.


// Sample Input-2:
// ---------------
// bajaj

// Sample Output-2:
// ----------------
// 9

// Explanation:
// ------------
// The special strings formed from the word "bajaj" are:
// 'b'ajaj, b'a'jaj, baj'a'j, ba'j'aj, baja'j', b'aja'j, ba'jaj', b'ajaj', 'bajaj'.

import java.util.*;
public class fs_A_day5_prgm3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
            arr.add(str.substring(i,j));
            }
        }
        for(String s:arr)
        {
            if(is_special_word(s))
            {
                count++;
            }
        }
        System.out.print(count);


    }
    public static boolean is_special_word(String word)
    {
        int[] freq=new int[26];
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            
                freq[word.charAt(i)-97]+=1;
           
        }

        for(int i=0;i<freq.length;i++)
        {

            if(freq[i]%2==1)
            {
                count++;
                if(count>1)
                {
                    count=0;
                    return false;
                }
            }
        }
        return true;
    }
}
