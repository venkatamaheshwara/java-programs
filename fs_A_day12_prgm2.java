// In a Maths class, the maths teacher gives a number 'n' to students, along with the number 
// she also gives another number 'k',
// the students of the class are supposed to give a new number after removing the k digits 
// from the given number.


// input = 157654
// 3
// output=154


// input=1432219
// 3
// output=1219
import java.util.*;
class fs_A_day12_prgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int digit=sc.nextInt();
        System.out.print (remove_k_digits(n,digit));
    }
    public static String remove_k_digits(String num, int k) {
        if(k==0)            
            return num;
        if(k==num.length())
            return "0";
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<num.length()){
            while(k>0 && sb.length()!=0 && sb.charAt(sb.length()-1)>num.charAt(i)){
                sb.deleteCharAt(sb.length()-1);
                k--;
            }            
            sb.append(num.charAt(i));
            i++;            
        }
        while(k>0){
            sb.deleteCharAt(sb.length()-1);
            k--;
        }
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
