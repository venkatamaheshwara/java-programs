
// At a night club there is a game organizing to gain maximum gold. 

// Weekend Ramesh is ready to play the game with an initial amount of X, 
// initial gold is 0, and a set of coupons where coupon[i] is the amount 
// in the ith coupon(0-indexed).

// Weekend Ramesh's goal is to achieve highest gold.
// He can play each coupon in one of two ways as per rules:
	
// 	- If the amount with Ramesh is at least the amount in coupon[i], 
// 	  then he may play the ith coupon as head, losing coupon[i] amount and gaining 1 gold.

// 	- If Ramesh's gold count is at least 1, he may play the i-th coupon as tail, gaining coupon[i] amount and losing 1 gold.

// Each coupon may be played at most once and in any order. 
// There is no need to play all the coupons by Weekend Ramesh.


// Your task is to find the maximum gold can be earned by Weekend Ramesh
// after playing any number of coupons.


// Input Format:
// -------------
// Line-1: Two integers N and X, N number of coupons, and intial amount X.
// Line-2: N space separated integers, amounts on the coupons. 

// Output Format:
// --------------
// Print an integer, maximum gold earned by Weekend Ramesh.


// Sample Input-1:
// ---------------
// 2 75
// 50 100

// Sample Output-1:
// ----------------
// 1

// Explanation:
// -------------
// Play the 0 coupon (50) to head, your amount becomes 50 and gold becomes 1.
// There is no need to play the 1 coupon since you cannot play it head 
// to add to your gold.


// Sample Input-2:
// ---------------
// 4 50
// 25 50 75 100

// Sample Output-2:
// ----------------
// 2

// Explanation:
// -------------
// Play the coupons in this order to get a gold of 2units:
// - Play the 0 coupon (25) to head, your amount becomes 25 and gold becomes 1.
// - Play the 3 coupon (100) to tail, your amount becomes 125 and gold becomes 0.
// - Play the 1 coupon (50) to head, your amount becomes 75 and gold becomes 1.
// - Play the 2 coupon (75) to head, your amount becomes 0 and gold becomes 2.


import java.util.*;
public class fs_A_day19_prgm1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int intial_amt=sc.nextInt();
        
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.print(get_max_gold(list,intial_amt));

    }
    public static int get_max_gold(List<Integer>coupons,int in_amt)
    {
        int gold_count=0;
        int temp_amt=in_amt;
        int count=coupons.size()-1;
        int max_gold=0;
        Collections.sort(coupons);
        int indx=0;
        while((gold_count > 0 || temp_amt >= coupons.get(indx)) &&  indx <= count)
        {
            if(( temp_amt>=coupons.get(indx) && indx <= count ))
            {
            temp_amt-=coupons.get(indx++);
            gold_count++;
            System.out.println(gold_count+" "+temp_amt+" "+indx);
            }
          //  System.out.println(gold_count+" "+temp_amt+" "+indx);

          else if(gold_count>=1 && indx <= count)
            {
                
                temp_amt+=coupons.get(count);
                gold_count--;
                count--;
             System.out.println(gold_count+" "+temp_amt+" "+indx);

            }
          
             System.out.println(gold_count+" "+temp_amt+" "+indx+"\n\n");
               if(gold_count>max_gold)
               {
                   max_gold=gold_count;
               }
            
        }
        return max_gold;
    }
    
}
