// srinivas is trying to rearrange characters in word based on frequency 
// of each character repeated number of times in that particular word.

// example:
// input =stff
// output =ffst


// input =fffbbb
// output =fffbbb

// both f and b appear three times , so answer would be fffbbb or bbbfff.
// return in insertion order of when they both are same frequency. 
 
// input =caAc
// output =ccaA



import java.util.*;
public class fs_A_day30_prgm1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(get_rearrange_word(s));
    }
    public static String get_rearrange_word(String str){
        Map<Character,Integer>mp=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        String s="";
        for(char c:str.toCharArray()) {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            int temp=mp.get(ch);
            if(max<temp){
                max=temp;
            }
        }
        for(int i=0;i<str.length();i++) {
            int temp=mp.get(str.charAt(i));
            if(temp>=max) {
                sb.append(str.charAt(i));
                max=temp;
            }
            else {
                s=s+str.charAt(i);
            }
        }
        sb.append(s);
        return sb.toString();
    }
}

