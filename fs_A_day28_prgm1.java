
import java.util.*;
public class fs_A_day28_prgm1 {
     static int indx;
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(get_format_string(str));
        
      
    }
    public static String get_format_string(String str)
    {
        StringBuilder sb=new StringBuilder();
        int temp_count=0;
        while(indx<str.length())
        {
            char ch=str.charAt(indx++);
            if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z'))
            {
                sb.append(ch);
            }
            else if(ch>='0' && ch<='9')
            {
                temp_count= ch -'0';
            }
            else if(ch=='[')
            {
                String s=get_format_string(str);
                for(int i=0;i<temp_count;i++)
                {
                    sb.append(s);
                }
                temp_count=0;
            }
            else
            {
                break;
            }
        }
        return sb.toString();
    }
}
