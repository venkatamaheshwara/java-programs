// You will be given a word 'w' and a group of words 'g'. 

// check if 'w' can be broken into a space separated characters of one or more in the given group of words 'g'

// Note the same word in the group of words may be re used multiple times in the breaking. 

// The first line of input contains the group of words(g) followed by a word(w)

// if it can done print true else print false

// input=fleet gold
// fleetgold
// output=true

// Explanation: prints true because fleetgold  can be broken as fleet gold

// input=apple pen
// applepenapple
// output=true

// Explanation: print true because "applepenapple" can be broken as "apple pen apple".
// Note that you are allowed to reuse group of words

// input=cats dogs and and cat
// catsandog
// output=false


import java.util.*;
public class fs_A_day8_prgm2 {
     
     
     static void check_words(String[] str_arr, String str){
         for(int i=0;i<str_arr.length;i++){
             if(str.contains(str_arr[i])){
                 str = str.replace(str_arr[i],"");
             }
            }
            
            if(str.length()==0) System.out.println("true");
            else System.out.println("false");
        }
        
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str_grp = sc.nextLine();
            String[] str_arr = str_grp.split(" ");
            String str = sc.next();
            check_words(str_arr, str);
        }
}