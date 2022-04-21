// Somu a Printing Press Man wants to print few words on a given plain paper. 
// He is a selfish man and doesnt want to waste the papers. 
// Intially he will be given the height and width size of the paper.
// He wants to see how many times the few words can be printed on the plain paper. 

// The order of the characters should remain same,and he cannot break the word and print it into two lines 
// A white space should separate two words in a line

// The first line of input contains the words followed by height and width size of the paper. 

// If he is not able to print on the given paper atlease once then print 0

// input=hello world
// 2 8
// output=1

// Explanation:
// hello_ _ _
// world_ _ _

// He can print only one time on the given plain white paper


// input=b efg h 
// 3 6
// output=2

// Explanation:
// b_efg _
// h_b_ _ _ 
// efg_h

import java.util.*;
public class fs_A_day9_prgm1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int height=sc.nextInt();
        int width=sc.nextInt();
        System.out.println(get_count_of_words(input,height,width));
    }
    public static int get_count_of_words(String str,int h,int w)
    {
        int count=0;
        int len=h*w;
        int size=str.length();
        int temp=size;
        count=len/temp;
       // String s="";
    //    while(temp<=len)
    //    {
    //        temp+=size;
    //        if(temp>=len)
    //        {
    //             break;
    //         }
    //         count++;
    //    }
    //    if(size<=len && count==0){
    //         count++;
    //     }
    //    if(count==0)
    //    {
    //         return 0;
    //    }
            return count;
    }
}
