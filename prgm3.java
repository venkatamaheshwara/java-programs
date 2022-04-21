/*
A string is called square if it is some string written twice in a row. 
For example, the strings "aa", "abcabc", "abab" and "baabaa" are square.
But the strings "aaa", "abaaab" and "abcdabc" are not square.

For a given string s determine if it is square.

1st line indicates input and second line indicates output
Example:
a
NO

aa
YES

abab
YES

abcabc
YES

abacaba
NO


*/
import java.util.*;
class Main
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    System.out.print(checksquarestring(str));
    }
    public static String checksquarestring(String s)
    {
        if(s.length()%2==1)
        {
            return "NO";
        }
        else
        {
            int middle=s.length()/2;
            for(int i=0;i<middle;i++)
            {
                if(s.charAt(i)!=s.charAt(middle+i))
                {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}