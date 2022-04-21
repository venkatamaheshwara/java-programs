// In a South Africa Class room, each student has a name with a single character. 
// Initally all the students names will be given. The teacher now wants the students 
// to be shuffled, so that two students names that are adjacent to each other are not same. 

// If the names can be shuffled in such a way print yes else  prints no. 

// input=ddt
// output=yes


// Explanation -the student names can be shuffled as dtd


// input=rrrt
// output=no

// Explanation - the studens names after shuffling will have same student names adjacent to each other 

import java.util.*;
 class Test
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(isadjacent(str))
		{
		    System.out.print("No");
		}
		else{
		System.out.println("Yes");
		}
	}
	public  static boolean isadjacent(String s)
	{
        int[] countArr = new int[26];
        char[] res = new char[s.length()];
        int maxIdx = 0, pos = 0;
        
        for(char c : s.toCharArray()){
            int idx = c - 'a';
            countArr[idx]++;
            if(countArr[maxIdx] < countArr[idx]) maxIdx = idx;
        }        
        
        if(countArr[maxIdx] > (res.length + 1)/2) return true;

        // while(countArr[maxIdx]-- > 0){
        //     res[pos] = (char) (maxIdx + 'a');
        //     pos += 2;
        // }

        // for(int i = 0; i < countArr.length; i++){
        //     while(countArr[i]-- > 0){
        //         if (pos >= res.length) pos = 1;
        //         res[pos] = (char) (i + 'a');
        //         pos += 2;
        //     }
        // }
        return false;
        
    }
}


