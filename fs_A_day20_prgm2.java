// 1
// 11
// 21
// 1211
// 111221
// 312211

// input:n=3
// output=21

// n=4
// output=1211

// n=5
// output=111221

import java.util.*;
public class fs_A_day20_prgm2 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(value(n));
        
    }
    public static String value(int num)
    {
        String s="1";
        if(num==1)
        {
            return s;
        }
        for(int i=2;i<=num;i++)
        {
            s=get_value(s);
        }
        return s;
    }
    public static String get_value(String str)
    {
        StringBuilder res=new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }
            else
            {
                res.append(count);
                res.append(str.charAt(i-1));
                count=1;
            }
        }
        res.append(count);
        res.append(str.charAt(str.length()-1));
        return res.toString();
    }
}
