// Wonderful String

// You will be given a Wonderful String,print the numbers of '2' in the wonderful string. 

// A wonderful string contains only two digits '1' and '2'.

// The string has following rules
// 	- The first few digits are as follows: 
// 	    "1221121221221121122......"
// 	- The string is originally formed as follows:
// 		1 22 11 2 1 22 1 22 11 2 11 22 ......
// 	and the count of '1's or '2's in each consecutive groups are:
// 		1 2 2 1 1 2 1 2 2 1 2 2 ......
// 	the count sequence above is in the string S itself.



// input=7
// output=3

// Explanation:
// ------------
// The sustring of length 7 is "1221121".The count of 2's is 3.


// input=12
// output=7

// Explanation:
// ------------
// The sustring of length 12 is "122112122122".The count of 2's is 7.

import java.util.*;
public class fs_A_day16_prgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(number_of_2s_in_magical_string(n));

    }
    static int number_of_2s_in_magical_string(int num)
    {
        int count=2;//head=2,tail=3
        int n=1;
         int [] arr=new int[100002];
        if(num<=0)
        {
            return 0;
        }
        if(num<=3)
        {
            return 2;
        }
        arr[0]=1;
        arr[1]=2;
        arr[2]=2;
        int i=3,j=2;
        while(i<num)
        {
            for(int k=0;k<arr[j];k++)
            {
                arr[i]=n;
                if(n==2 && i<num) count++;
                i++;
            }
           n=n^3;
           j++;
        }
    //      List<Integer>list1=new ArrayList<>();
    //      list1.add(1);
    //      list1.add(2);
    //      list1.add(2);
    //      int i=3,j=2;
    //    // int temp=1;
    //      while(i<num)
    //      {
    //          for(int m=0;m<list1.get(j);m++)
    //         {
    //             list1.add(n);
    //              ++i;
    //         }
    //              if(n==1)
    //             {
    //                 n=2;
    //             }
    //             else{
    //                 n=1;
    //             }
    //             j++;
    //       }
    //         System.out.print(list1);
    //     for(int r=0;r<num;r++)
    //     {
    //         if(list1.get(r)==2)
    //         {
    //             count++;
    //         }
    //     }
         
        return count;
    }
}
