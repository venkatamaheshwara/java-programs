// tinku is playing three card game with scores x,y and z with computer.
// In each chance he choose 2 different non empty score cards,  subracts one point from the score and adds one point to computer score.

// the game will stops when there are fewer than two non-empty cards(meaning there are no more subtraction possible).

// Given three integers x, y and z , print maximum score computer can get.

// example
// input =2 4 6
// output =6

// x = 2, y = 4, z = 6

// Explanation: The starting scores are (2, 4, 6). 

// One optimal set of subtraction is:
// - Take from 1st and 3rd cards, scores is now (1, 4, 5)
// - Take from 1st and 3rd cards, scores is now (0, 4, 4)
// - Take from 2nd and 3rd cards, scores is now (0, 3, 3)
// - Take from 2nd and 3rd cards, scores is now (0, 2, 2)
// - Take from 2nd and 3rd cards, scores is now (0, 1, 1)
// - Take from 2nd and 3rd cards, scores is now (0, 0, 0)

// There are fewer than two non-empty cards, so the game ends. so computer total score is : 6.



// input =1 8 8
// output =8

// x = 1, y = 8, z = 8

// Explanation: One optimal set of scores is to take from the 2nd and 3rd cards for 8 turns until they are empty.
// After that, there are fewer than two non-empty cards, so the game ends. so computer will get score is 8 .
// loop:
// //2 4 6=maxheap;
// a=poll(6),maxheap=2 4
// b=poll(4),maxheap=2
// a--,b--
// if(a>0 && b>0)
// {
// add(a,b) into maxheap;
// }

import java.util.*;
public class fs_A_day23_prgm1 {
    public static void  main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int max=0,min=0;
       int max_score=0;
       PriorityQueue<Integer>max_heap=new PriorityQueue<>(Collections.reverseOrder());
       max_heap.add(x);
       max_heap.add(y);
       max_heap.add(z);
       while(max_heap.size()>=2)
        {
            int a=max_heap.poll();
            int b=max_heap.poll();
            max_score++;
            a--;
            b--;
            if(a>0 && b>0)
            {
                max_heap.add(a);
                max_heap.add(b);
            }
            else if(a>0 && b==0)
            {
                max_heap.add(a);
            }
            else if(b>0 && a==0)
            {
                max_heap.add(b);
            }
          
            
        }
        System.out.print(max_score++);
    }
    
}
