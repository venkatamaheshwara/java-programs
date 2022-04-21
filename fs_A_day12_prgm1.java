// The municipal corporation of hyd is planning to conduct a voting survey, 
// they are getting confused with the common names in the given list. 
// The concerned officer finds the few characters of the names same and removes them. 
// Help the officer to find the same characters that begin with the same name

// The first line of input contains the number of voters names followed by voters names

// If no such thing exists print -1

// input = 3
// apple ape april
// output = ap


// input = 4
// abhishake abhignya abhinayni abhiram
// output=abhi
import java.util.*;
class  fs_A_day12_prgm1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        System.out.print(remove_same_characters(str));
    }
    public static String remove_same_characters(String[] s)
    {
      Arrays.sort(s);
      String res="";
      String start=s[0];
      String end=s[s.length-1];
      for(int i=0;i<start.length();i++)
      {
          if(start.charAt(i)==end.charAt(i))
          {
              res+=start.charAt(i)+"";
          }
      }
      if(res.length()!=0)
        return res;
    else
        return "-1";
      
    }
  
}