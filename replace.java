/*
The program will recieve 3 English words inputs from STDIN

These three words will be read one at a time, in three separate line
The first word should be changed like all vowels should be replaced by %
The second word should be changed like all consonants should be replaced by #
The third word should be changed like all char should be converted to upper case
Then concatenate the three words and print them
Other than these concatenated word, no other characters/string should or message should be written to STDOUT

For example if you print how are you then output should be h%wa#eYOU.

You can assume that input of each word will not exceed more than 5 chars
*/
import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        System.out.print(replace_string(s1,s2,s3));
    }
    public static String replace_string(String w1,String w2,String w3)
    {
        String res="";
        // char ch1[]=w1.toCharArray();
        // char ch2[]=w2.toCharArray();
        // char ch3[]=w3.toCharArray();
        for(int i=0;i<w1.length();i++)
        {
            if(w1.charAt(i)=='a'||w1.charAt(i)=='e'||w1.charAt(i)=='i'||w1.charAt(i)=='o'||w1.charAt(i)=='u')
            {
                //ch1[i]='%';
                res=res+"*";
            }
            else
            {
                res=res+w1.charAt(i)+"";
            }
        }
        for(int i=0;i<w2.length();i++)
        {
            char ch = w2.charAt(i);
            if(w2.charAt(i)!='a'&&w2.charAt(i)!='e'&&w2.charAt(i)!='i'&&w2.charAt(i)!='o'&&w2.charAt(i)!='u')
            {
                //ch2[i]='#';
                res=res+"#";
            }
            else
            {
                res=res+w2.charAt(i)+"";
            }
        }
        for(int i=0;i<w3.length();i++)
        {
            res=res+(w3.charAt(i)+"").toUpperCase();
        }
        return res;
    }
}