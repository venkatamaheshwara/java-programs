// Ramu is playing with two strings s1 and s2. he wants to construct the newString in the following way.

//    -- if s1 is not empty append the first character in s1 to newString and delete it from s1.
//      example: if s1=abc and newString=de, then after choosing this operation, s1=bc and newString =dea
//    -- if s2 is not empty append the first character in s2 to newString and delete it from s2.
//       example: if s2=abc and newString="" then after choosing this operation, 
//       s2=bc and newString= a
//   Note: return the lexicographically largest newString ramu need to construct

// example 1:
// intput =
// cabaa
// bcaaa
// output =cbcabaaaaa

 
// Explanation: One way to get the lexicographically largest newString is:
// - take from s1: newString = "c", s1 = "abaa", s2 = "bcaaa"
// - Take from s2: newString = "cb", s1 = "abaa", s2 = "caaa"
// - Take from s2: newString = "cbc", s1 = "abaa", s2 = "aaa"
// - Take from s1: newString = "cbca", s1 = "baa", s2 = "aaa"
// - Take from s1: newString = "cbcab", s1 = "aa", s2 = "aaa"

// - Append the remaining 5 a's from s1 and s2 at the end of newString.

    
// input= abcabc
// abdcaba
// output =abdcabcabcaba



import java.util.*;
public class fs_A_day17_prgm1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.print(get_new_string(s1,s2));
    }
    public static String get_new_string(String str1,String str2)
    {
        StringBuilder res=new StringBuilder("");
        int i=0,j=0;
        while(i<str1.length() && j<str2.length())
        {
            if(str1.charAt(i)>str2.charAt(j)){
            
                 res.append(str1.charAt(i++));
            }
            else if(str1.charAt(i)<str2.charAt(j)) {
                res.append(str2.charAt(j++));
                
            }
            else{
                if(str1.substring(i).compareTo(str2.substring(j))>0){
                    res.append(str1.charAt(i++));
                }
                else{
                    res.append(str2.charAt(j++));
                }
            }
            
            
        }
        res.append(str1.substring(i));
        res.append(str2.substring(j));
           
                
        return res.toString();
    }
}