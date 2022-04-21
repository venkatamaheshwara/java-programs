
// Ramu is a milk supplier. He has only two aluminium cups of capacity m and n litres. 
// Using these two cups only, he can measure the milk. 
// He has to supply exactly P litres of milk

// To measure the milk, the operations allowed are:
// 	- Fill one of the cups completely with milk.
// 	- Empty the other cup.
// 	- Pour milk from one cup into another cup till it fills completely,
// 	 or the first cup itself is empty.
	 
// Such that, at the end one or both cups contains P litres of the milk.
	
// Please help Ramu, to check whether P litres of milk can be measured
// using the two cups or not.

// Input Format:
// -------------
// 3 space separated integers, m, n and P.

// Output Format:
// --------------
// Print a boolean value.


// input=3 5 4
// output=true


// input=2 4 5
// output=false

import java.util.*;
class fs_A_day10_prgm1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.print(is_milk_exactle_of_p_liters(m,n,p));
    }
    public static boolean is_milk_exactle_of_p_liters(int m1,int n1,int p1)
    {
        if(m1+n1<p1)
        {
            return false;
        }
        int x=get_gcd(m1,n1);
        if(p1%x==0)
        {
            return true;
        }
        return false;
    }
    public static int get_gcd(int a,int b)
    {
        while(b!=0)
        {
            if(a>b)
                a-=b;
            else
                b-=a;

        }
        return a;
        
        
    }
}