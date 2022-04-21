// for given number n and k, find out non-negative integers of length n and difference between consecutive digits is k.

// for example: 

// input =1 0
// output =0 1 2 3 4 5 6 7 8 9

// length of each number should be 1 and difference betweeen consecutive digits is k ie 1.

// input = 2 1
// output =10 12 21 23 32 34 43 45 54 56 65 67 76 78 87 89 98

// length of each number is n(i.e 2 in this case) and difference between consecutive digits is k ie 1.


// input =3 7
// output =181 292 707 818 929

// length of each number is n(ie 3 in this case) and difference between consecutive digits is k ie 7.


import java.util.*;

public class fs_A_day18_prgm2 {
    static List<Integer>list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        TreeSet<Integer>ts=new TreeSet<>();
        ts=get_numbers(n,k);
        for(int res:ts)
        {
            System.out.print(res+" ");
        }
    }
    public static TreeSet<Integer>get_numbers(int n,int k)  
    {
        TreeSet<Integer>t=new TreeSet<>();
        int a=1;
        if(n==1)
        {
            a=0;
        }
        for(int i=a;i<=9;i++)
            get_digit_and_consecutive_diff(n-1,k,i,i);
        for(int i=0;i<list.size();i++)
        {
            t.add(list.get(i));
        }
        return t;
    }
    public static void get_digit_and_consecutive_diff(int n,int k,int res,int prev)
    {
        if(n==0)
        {
            list.add(res);
            return;
        }
        int temp1=prev+k;
        int temp2=prev-k;
        if(temp1>=0 && temp1<=9)
            get_digit_and_consecutive_diff(n-1,k,res*10+temp1,temp1);
        if(temp2>=0 && temp2<=9 && temp1!=temp2)
            get_digit_and_consecutive_diff(n-1,k,res*10+temp2,temp2);
    

    }
    
}
