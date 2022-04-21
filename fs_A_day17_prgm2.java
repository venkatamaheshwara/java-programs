// UBER driver has a vehicle, daily he used go in only one direction.
// Capacity of the vehicle is S (no of seats except driver seat), 

// Given a list of N bookings, booking[i]= [ num_customers, pickup, drop ].
// booking indicates, number of customers to pick up, and pick up, droping points.

// Initially the vehicle is empty.

// Return true if and only if it is possible to pick up and drop off all customers of all bookings.

// Input Format:
// -------------
// Line-1 -> Two integers N and S, number of bookings and number of seats in the vehicle.
// Next N Lines -> three space separated integers, num_customers, pickup point, dropping point

// Output Format:
// --------------
// Print a boolean value.


// Sample Input-1:
// ---------------
// 2 5
// 2 1 5
// 3 3 7

// Sample Output-1:
// ----------------
// true


// Sample Input-2:
// ---------------
// 2 4
// 2 1 5
// 3 3 7

// Sample Output-2:
// ----------------
// false


// Sample Input-3:
// ---------------
// 3 11
// 3 2 7
// 3 7 9
// 8 3 9

// Sample Output-3:
// ----------------
// true


import java.util.*;
public class fs_A_day17_prgm2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int N=sc.nextInt();
        int cap=sc.nextInt();
        int[][] bookings=new int[N][3];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<3;j++)
            {
                bookings[i][j]=sc.nextInt();
            }
        } 
        System.out.print(is_possible_to_pickup_dropoff_all_passengers(bookings,cap));  
        
    }
    public static boolean is_possible_to_pickup_dropoff_all_passengers (int[][] trips, int cap) {
        int from=Integer.MAX_VALUE;
        int to=Integer.MIN_VALUE;
        for(int []trip:trips)
        {
            from=Math.min(from,trip[1]);
            to=Math.max(to,trip[2]);
        }
        int temp=to-from+1;
        int[] diffs = new int[temp];
        for(int[] trip: trips) {
            int f = trip[1] - from;
            int t = trip[2] - from;
            int people = trip[0];
            diffs[from] += people;
            if(diffs[from] > cap) return false; // if diff is bigger than capacity than the overall value definetely exceeded we can return early
            diffs[t] -= people;
        }
        
        for(int i = 1; i < temp; i++) {
            diffs[i] += diffs[i-1];
            if(diffs[i] > cap) return false;
        
    }
    return true;
}
}


