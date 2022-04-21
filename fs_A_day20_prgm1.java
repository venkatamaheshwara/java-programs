// shiva is playing with group of characters, his teacher  called him and asked him to arrange the character as per the following rules.


// rule1: remove the smallest character from the group and append it to the result.

// rule2: remove the smallest character from the group which is greater than the last appended character to the result and append it.

// rule3: Repeat rule 2 until you cannot pick more characters.

// rule4: remove the largest character from the group and append it to the result.

// rule5: remove the largest character from group which is smaller than the last appended character to the result and append it.

// rule6: Repeat rule: 5 until you cannot pick more characters.

// rule7: Repeat the rules from 1 to 6 until you pick all characters from the group.

// In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.

// Return the result string after doing the above rules.

 
// Input: s = "aaaabbbbcccc"
// Output: "abccbaabccba"

// Explanation: After rules 1, 2 and 3 of the first iteration, result = "abc"
// After rules 4, 5 and 6 of the first iteration, result = "abccba"
// First iteration is done. Now s = "aabbcc" and we go back to rule 1
// After rules 1, 2 and 3 of the second iteration, result = "abccbaabc"
// After rules 4, 5 and 6 of the second iteration, result = "abccbaabccba"


// input=matratcat
// output=acmrttaat

import java.util.*;

public class fs_A_day20_prgm1 {
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(new fs_A_day20_prgm1().get_new_string(s));
    }
    public String get_new_string(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        StringBuilder res=new StringBuilder();
       while(sb.length()!=0)
       {
           for(char ch='a';ch<='z';ch++)
           {
               int indx=sb.indexOf(ch+"");
               if(indx!=-1)
               {
                   res.append(ch);
                   sb.deleteCharAt(indx);
               }
           }
           for(char ch='z';ch>='a';ch--)
           {
               int indx=sb.indexOf(ch+"");
               if(indx!=-1)
               {
                   res.append(ch);
                   sb.deleteCharAt(indx);
               }
           }
       }
       return res.toString();
    }

    
}
