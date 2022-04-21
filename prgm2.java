
import java.util.*;
class prgm2
{
    public static String moveHyphen (String str, int n) 
    {
        String s="";
        int count_hyphen=0;
        for(int i=0;i<n;i++)
        {
           char ch=str.charAt(i);
            if(ch=='-')
            {
                count_hyphen++;
                s=s+"";
            }
            else
            {
                s=s+ch;
            }
        }
        for(int i=0;i<count_hyphen;i++)
        {
            s="-"+s;
        }
        
        return s;
    }

    public static void main (String[]args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(moveHyphen (str,str.length()));
    } 
}