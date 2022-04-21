/*
Determine whether there exists a one-to-one character mapping from one string s1 to another s2.

For example, given s1 = abc and s2 = bcd, return true since we can map a to b, b to c, and c to d.

Given s1 = foo and s2 = bar, return false since the o cannot map to two characters.


*/
import java.util.*;
class Test
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.print(is_one_to_one_mapping(s1,s2));
    }
    public static boolean is_one_to_one_mapping(String str1,String str2)
    {
        char[]c1=new char[str1.length()];
            char[]c2=new char[str2.length()];
        if(str1.length()!=str2.length())
        {
            return false;
        }
        else
        {
            
            for(int i=0;i<str1.length()-1;i++)
            {
                if(str1.charAt(i)!=str1.charAt(i+1))
                {
                    c1[i]=str1.charAt(i);
                }
            }
            for(int i=0;i<str2.length()-1;i++)
            {
                if(str2.charAt(i)!=str2.charAt(i+1))
                {
                    c2[i]=str2.charAt(i);
                }
            }
           
              
        }
         if(c1.length==c2.length)
            {
                return true;
            }
        return false;
    }
}