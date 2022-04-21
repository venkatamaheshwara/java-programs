// Ramesh has given a task to you on Strings.
// You have given a string S ([a-z]), and an integer array Arr[]
// Now your task is to modify 'S' in such way:
// replace the 'i+1' characters in the string, with next i-th character in alphabetic order(cyclic).

// For example, if S="art", Arr[]=[2,3,5] is 3, 
// i=0, modify('a') = 'c' , S="crt".
// i=1, modify('c') = 'f', modify('r') = 'u', S="fut".
// i=2, modify('f') = 'k', modify('u') = 'z', modify('t') = 'y', S="kzy"
// Finally modified string is kzy. 

// Note: modify('z') ='a' when arr[i]=1

// Return the final modified string after all such modifications to S are applied.

// Input Format:
// -------------
// Line-1 -> A String S,  string length is L
// Line-2 -> L space separated integers.

// Output Format:
// --------------
// Print modifed String.


// Sample Input-1:
// -------------------
// adbp
// 1 2 3 4

// Sample Output-1:
// --------------------
// kmit








import java.util.*;
public class fs_A_day18_prgm1_sol1 {
 public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(get_modified_string(s,arr));
    }
    public static String get_modified_string(String str,int[] num_arr)
    {
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        for(int i=0;i<str.length();i++)
        {
         for(int j=0;j<=i;j++)
         {
             char ch=(char)((((str.charAt(j)-'a')+num_arr[i])%26)+'a');
             str =  sb.replace(j,j+1,ch+"").toString();
    
             System.out.print(sb.toString()+"   ");
         }
         System.out.println();
        }
        return str;
    }
}
