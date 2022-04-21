/*
Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is 
variable. The task is to find the minimum number of ‘*’ or ‘#’ to make
it a valid string. The string is considered valid if the number of ‘*’ 
and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.

 

Note : The output will be a positive or negative integer based on number 
of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0

case=1
input=b#y#e*kmi*t*#k###cd#
output=
-4
case=2
input=he#*##llo**
output=
0
case=3
input=aadhya****bantu###
output=
1
*/
import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(valid_string(str));
    }
    public static int valid_string(String s)
    {
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                c1++;
            }
            else if(s.charAt(i)=='#')
            {
                c2++;
            }
            
        }
        if(c1>c2)
        {
            return c1-c2;
        }
        else if(c1<c2)
        {
            return c1-c2;
        }
        return 0;
    }
    
}
 