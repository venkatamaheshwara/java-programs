// Ramesh is playing a online game with 45 Levels.

// In Each time ramesh can play one or 2 levels. 

// In how many distinct ways can ramesh reach the given level

// ex:
// input =2
// output =2

// two ways to reach the top Level(here top level is 2)
// using 
// one way to reach top level is playing     Level-1 +Level-2 separetly
// second way to reach top level is playing  Level-1& 2 at time


// ex: 
// input =3
// output =3
// there are three ways to reach the top level
// 1) level-1 + level-2 +level-3
// 2) level-1 + level-2 and level-3 at time
// 3) level-1 & level2 at time and level-3



import java.util.*;
public class fs_A_day28_prgm2 {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(get_Distinct_Ways(n));
    }
    public static int get_Distinct_Ways(int temp)
    {
        int [] table=new int[temp+1];
        table[0]=1;
        table[1]=1;
        for(int i=2;i<=temp;i++)
        {
            table[i]=table[i-1]+table[i-2];
        }
        return table[temp];
    }
    
}
