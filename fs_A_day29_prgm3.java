// Prabhu is playing a game. 
// As Part of this game at any given time he can score 3 or 5 or 10 points.
// If the Target Score is Given to Prabhu. 
// Find the total number of Possibility he can get the Score.

// input = 13
// output = 2

// Explanation - 
// 3 5 5
// 3 10

// Two Ways to reach the Target.

// input = 20
// output = 4

// Explanation-
// 10 10
// 5 5 10
// 5 5 5 5 
// 3 3 3 3 3 5
import java.util.*;
public class fs_A_day29_prgm3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(get_possiblities(num));
    }
    public static get_possiblities(int n){
        int [] tab=new int[n+1];
        
    }
    
}
