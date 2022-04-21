import java.util.*;
public class fs_A_day18_prgm1_sol2 {

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(new fs_A_day18_prgm1_sol2().shiftingLetters(s,arr));
    }

    public String shiftingLetters(String s, int[] shifts) {
        int sum = 0;
        char[] arr = new char[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            sum += shifts[i]%26;
            char a = (char)((s.charAt(i)-'a'+sum)%26+'a');
            arr[i] = a;    
        }
        return new String(arr);
    }
}
