// Shyam a Fifth class boy is working on numbers, Given few numbers 
// he has to construct a new number which is greatest number. 

// The first line of input contains the size of the numbers followed by the numbers

// input = 2
// 50 7
// output = 750

// input = 5
// 3 30 34 5 9
// output = 9534330

import java.util.*;
public class fs_A_day13_prgm3 {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(get_greatest_number(arr,n));
    }
    public static String get_greatest_number(int a[],int num)
    {
        String res="";
        int count=0;
        for(int i=0;i<num;i++)
        {
            if(a[i]==0)
            {
                count++;
            }
        }
        if(count==a.length)
        {
            return "0";
        }
        for(int i=0;i<num;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                String x=a[i]+""+a[j];
                String y=a[j]+""+a[i];
             if(x.compareTo(y)<1)
            {
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;

            }
            }
            
        }
        for(int i=0;i<num;i++)
        {
            res=res+a[i];
        }
        return res;
        
    }
    
}
