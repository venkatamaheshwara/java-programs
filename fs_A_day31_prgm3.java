// Somesh is working on Number Strings.
// He got an idea to find the smallest possible number by 
// deleting some digits from the number without changing 
// the relative order of digits in it.

// You will be given a integer String 'num', and an integer n.
// Find the smallest number possible after deleting n digits from 'num'.

// Note: If the number string 'num' turns to empty, print 0.

// Input Format:
// -------------
// Line-1 : A string num, consist of digits only.
// Line-2 : An integer n, number of digits to delete.

// Output Format:
// --------------
// Print the smallest possible number.


// Sample Input-1:
// ---------------
// 1432219
// 3

// Sample Output-1:
// ----------------
// 1219

// Explanation: 
// ------------
// Delete the three digits 4, 3, and 2 to form the smallest number 1219.


// Sample Input-2:
// ---------------
// 10200
// 1

// Sample Output-2:
// ----------------
// 200

// Explanation:
// ------------
// Delete the leading 1 and the smallest number is 200. 
// Note that the output must not contain leading zeroes.


import java.util.*;
public class fs_A_day31_prgm3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        int digit=sc.nextInt();
        System.out.print(get_min_number(num,digit));
    }
    public static String get_min_number(String n,int d){
        //StringBuilder sb=new StringBuilder(n);
        // List<Character>ls=new ArrayList<>();
        // for(char c:n.toCharArray()){
        //     ls.add(c);
        // }
        int i=0,index=0;
        char []buffer=new char[n.length()];
        while(i<n.length()){
            while(index>0 && d>0 && n.charAt(i)<buffer[index-1]){
                index--;
                d--;
            }
            buffer[index++]=n.charAt(i);
            i++;
            if(d==0) break;
        }
        index-=d;
        StringBuilder res=new StringBuilder(String.valueOf(buffer,0,index));
        if(i<n.length()){
            res.append(n.substring(i));
        }
        i=0;
        while((res.length()>i+1) &&(res.charAt(i)=='0'))
            i++;
     return  res.substring(i).toString();
    }
}
