import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next().toLowerCase();
        String s2=sc.next().toLowerCase();
        System.out.print(getconcatination_of_two_strings(s1,s2));
    }
    public static int getconcatination_of_two_strings(String s,String t)
    {
        int count=0;
        String arr[]=new String[s.length()];
        String arr2[]=new String[t.length()];
        ArrayList<String>al=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            arr[i]=s.substring(0,i+1);
        }
        for(int i=0;i<t.length();i++)
        {
            arr2[i]=t.substring(0,i+1);
        }
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<t.length();j++)
            {
                String let=arr[i]+arr2[j];
                if(!al.contains(let))
                {
                   // res=res+let;
                    al.add(let);
                }
            }
        }
        return al.size();
    }
}