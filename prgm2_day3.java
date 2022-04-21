/*
Vishal has given a task to find the successor of a given alphabet 'alp' in a given string str[].

The alphabets in the given string str[] are all lowercase letters and always in non-decreasing order.

A successor of 'alp' is the next smallest alphabet exist in the string str[] which is greater than 'alp'.

Assume that alphabets can be considered in cyclic fashion.
For example: Successor for alp='z' in str[]="bcd" is 'b'.

Input Format:
-------------
Line-1:A string str[]
Line-2: a character represents an alphabet.
 
Output Format:
--------------
Print a character which is the successor.
 
Constraints:
 2 <= str.length<= 10^4
'alp' is a lowercase letter.

 
Sample Input-1:
---------------
adghijl
f 
Sample Output-1:
----------------
g

Sample Input-2:
---------------
abcdefghi
j

Sample Output-2:
----------------
a

*/
import java.util.*;
class Test
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[]ch=str.toCharArray();
        char read=sc.next().charAt(0);
        System.out.print(getsuccessor(ch,read));
    }
    public static char getsuccessor(char[]c,char ch)
    {
        for(int i=0;i<c.length-1;i++)
        {
            if(c[i+1]>ch && c[i]<ch)
            {
                return c[i+1];
            }
           
        }
        return c[0];
    }
}