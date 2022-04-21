// Srinivas is playing with array of numbers.
// he has to print distinct element from every subarray size of k.

// example:
// input =7
// 1 2 3 2 2 1 3
// 3
// output =3 2 2 2 3

// number of distinct elements in each subarray of k size is as follows:
// here size of subarray is 3 so
// consider first 3 elements [1,2,3] so ans = 3(3 elements are distinct)
// consider next 3 elements  [2,3,2] so ans=2(elements are distinct ie 2 and 3)
// consider next 3 elements[3,2,2] so ans =2
// consider next 3 elements[2,2,1] so ans =2
// consider next 3 elements[2,1,3] so ans =3

// return result=[3,2,2,2,3]


// intput =7
// 1 1 1 1 2 3 4
// 4
// output=1 2 3 4 

// Explanation: The number of distinct elements in each subarray goes as follows:
// [1,1,1,1] so ans[0] = 1
// [1,1,1,2] so ans[1] = 2
// [1,1,2,3] so ans[2] = 3
// [1,2,3,4] so ans[3] = 4

import java.util.*;
public class fs_A_day22_prgm1 {
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>input=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            input.add(sc.nextInt());
        }
        int k=sc.nextInt();
        List<Integer>res=new ArrayList<>();
        res=get_count(input,k);
        System.out.print(res);
    }
    public static List<Integer>get_count(List<Integer>list,int win)
    {
        List<Integer>temp=new ArrayList<>();
       Map<Integer,Integer>mp=new HashMap<>();
       int count=0;
       for(int i=0;i<list.size();i++)
       {
           if(i>=win)
           {
               mp.put(list.get(i-win),mp.getOrDefault(list.get(i-win),0)-1);
               if(mp.get(list.get(i-win))==0)
               {
                   count--;
               }
           }
           mp.put(list.get(i),mp.getOrDefault(list.get(i),0)+1);
           if(mp.get(list.get(i))==1)
           {
               count++;
           }
           if(i>=win-1)
           {
               temp.add(count);
           }
       }
       return temp;
    }
}
