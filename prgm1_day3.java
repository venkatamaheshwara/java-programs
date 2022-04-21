/*
Given a string, return the first recurring character in it, or null if there is no recurring character.

For example, given the string "acbbac", return "b". Given the string "abcdef", return null.
*/
import java.util.*;
class Test
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(getfirstrecurringcharacter(str));
    }
    public static String getfirstrecurringcharacter(String s)
    {
        //char ch='';
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                return s.charAt(i)+"";      
            }
        }
        return null;
    }
}