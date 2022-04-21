
// Ramu is given a pair of words, Now his teacher has given him a task. 
// His task is to see if the individual alphabets of the words are mapped properly or not 

// If they do so print true else print false

// Two strings are mapped properly  if the characters in 's' can be replaced to get 't'.
// All occurrences of a alphabet must be replaced with another alphabet while preserving the order of alphabets
// No two alphabets may map to the same alphabet but a alphabet may map to itself.


// Note:
// You may assume both s and t have the same length and all inputs contains('a-z')

// input = 
// egg
// app
// output = true

// input = 
// foo
// bar
// output = false

// input = 
// papel
// title
// output = true
import java.util.*;
class fs_A_day4_prgm2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.print(is_mapped(s1,s2));
    }
    public static boolean is_mapped(String str1,String str2)
    {
        HashMap<Character,Character>hm1=new HashMap<>();
        HashMap<Character,Boolean>hm2=new HashMap<>();
        boolean bool=true;
        if(str1.length()!=str2.length())
        {
            return false;
        }
        else
        {
        // char[]ch1=new char[str1.length()];
        // char[]ch2=new char[str2.length()];
        for(int i=0;i<str1.length();i++)
        {
             if(hm1.containsKey(str1.charAt(i)))
             {
                 char temp=hm1.get(str1.charAt(i));
                 if(temp!=str2.charAt(i))
                 {
                     bool=false;
                     break;
                 }
             }
             else
             {
                 if(hm2.containsKey(str2.charAt(i)))
                 {
                     bool=false;
                     break;
                 }
                 else
                 {
                     hm2.put(str2.charAt(i),true);
                     hm1.put(str1.charAt(i),str2.charAt(i));
                 }
             }
         }
      }
        return bool;
    }
}
