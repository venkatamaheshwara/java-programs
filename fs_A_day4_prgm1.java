
// Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, 
// return a sorted array of only the integers that appeared in all three arrays in increasing order

// For any other Boundary Conditions Print -1 
// Assume all the three input array contains positive elements 

// The first line of input contains the first array elements followed by second array elements followed by third array elements 

// input =
//  1 2 3 4 5 11 15
//  1 2 5 7 
//  1 3 4 5 8 20 45 55
// output = 
// 1 5

// Explanation: Only 1 and 5 appeared in the three arrays.


// input = 
// 3 4 4 5 6 7
// 40 50 60 70 80 90
// 500 600
// output = -1


// input = 
//  1 1 1 2
// 1 1 
// 1 2 3 4 5
// output = 1
import java.util.*;
class fs_A_day4_prgm1
{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String str1[]=sc.nextLine().split(" ");
         String str2[]=sc.nextLine().split(" ");
         String str3[]=sc.nextLine().split(" ");
         ArrayList<Integer> al1=new ArrayList<Integer>();
         ArrayList<Integer>al2=new ArrayList<Integer>();
         ArrayList<Integer> al3=new ArrayList<Integer>();
         Set<Integer>res=new HashSet<Integer>();
            for(int i=0;i<str1.length;i++)
         {
            int a=Integer.parseInt(str1[i]);             
             al1.add(a);
         }
         for(int i=0;i<str2.length;i++)
         {
            int a=Integer.parseInt(str2[i]);             
             al2.add(a);
         }
         for(int i=0;i<str3.length;i++)
         {
            int a=Integer.parseInt(str3[i]);             
             al3.add(a);
         }
         res.addAll(get_common_elements(al1,al2,al3));
        if(res.size()==0)
        {
            System.out.print(-1);
        }
        else
        {
                for(int result:res)
                {
                    System.out.print(result+" ");
                }
        }
    }
    public static Set<Integer>get_common_elements(ArrayList<Integer> ls1,ArrayList<Integer> ls2,ArrayList<Integer> ls3)
    {
        Set<Integer>output=new HashSet<>();
        ls2.retainAll(ls1);
         ls3.retainAll(ls2);
         for(int v:ls3)
         {
            output.add(v);
         }
        return output;
    }
}