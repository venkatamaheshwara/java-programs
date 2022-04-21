import java.util.ArrayList;
import java.util.Scanner;

// Given two Integer ArrayList, add their elements to a new ArrayList by satisfying following conditions 

// 1. Addition should be done starting from 0th index of both ArrayList.
// 2. Split the sum if it is a not a single digit number and store the digits in adjacent locations
// 3. Output ArrayList should accommodate any remaining digits of larger input ArrayList.
// 4.Assume the input contains only positive numbers

// Examples:
// First line contains the size of first ArrayList followed by first ArrayList elements followed by second ArrayList size followed by 
// second ArrayList elements 


// input =
// 6
// 9 2 3 7 9 6
// 8
// 3 1 4 7 8 7 6 9
// output =
// 1 2 3 7 1 4 1 7 1 3 6 9

// input = 
// 6
// 9343 2 3 7 9 6
// 8
// 34 11 4 7 8 7 6 99
// output =
// 9 3 7 7 1 3 7 1 4 1 7 1 3 6 9 9

// input = 
// 3
// 345 124 54
// 5
// 123 221 325 4234 5167
// output = 
// 4 6 8 3 4 5 3 7 9 4 2 3 4 5 1 6 7

public class fs_A_day3_prgm1 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>al1=new ArrayList<>();
        ArrayList<Integer>al2=new ArrayList<>();
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++)
        {
            int val=sc.nextInt();
            al1.add(val);
        }
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++)
        {
            int val=sc.nextInt();
            al2.add(val);
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int k:getsum(al1, al2))
        {
            res.add(k);
        }
        for(int i:res)
        {
            System.out.print(i+" ");
    
        }
   }
    public static ArrayList<Integer> getsum(ArrayList<Integer> l1,ArrayList<Integer> l2)
    {
        //int result =0;
        ArrayList<Integer>temp=new ArrayList<>();
        int i=0;
        int num1=l1.size(),num2=l2.size();
        while(i<num1 && i<num2)
        {
            int add=l1.get(i)+l2.get(i);
            split_sum(add,temp);
            i++;
        }
        while(i<num1)
        {
            split_sum(l1.get(i++),temp);
            
        }
        while(i<num2)
        {
             split_sum(l2.get(i++),temp);
        }

        return temp;
    }
    public static void  split_sum(int n,ArrayList<Integer> res )
    {
        if(n>0)
        {
            split_sum(n/10,res);
            res.add(n%10);
        }
    }
        
    
}
