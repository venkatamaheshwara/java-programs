// Amazon Fire TV Stick Remote

// Tinku a Small Kid is playing with the Amazon Fire TV Stick Remote
// Tinku is not familar with the alphabets. 
// He father gives him few alphabets and asks Tinku to type it. 
// Tinku uses only one finger. 
// At the Beginining, he will put his finger at the the 1st key, k[0];
// To type the Next Alphabet he has to move his finger from that key(m) 
// to that particular alphabet(n) he takes |m-n| seconds. 

// Help Tinkus Father to see how much seconds does Tinku take to type the given alphabets.


// input=poiuytrewqasdfghjklmnbvcxz
// kmit
// output=39


// input=abcdefghijklmnopqrstuvwxyz
// code
// output=26


import java.util.*;
public class fs_A_day29_prgm2 {
    public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        String key=sc.next();
        System.out.print(get_Time(string,key));
    }
    public static int get_Time(String s,String k)
    {
        Map<Character,Integer>mp=new HashMap<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            mp.put(s.charAt(i),i);
        }
        
         System.out.print(mp);
        // char[] ch=s.toCharArray();
        int m=0;
        int n=0;
        int time=0;
        //int len=k.length()-1;
        
        for(int i=0;i<k.length();i++)
        {
            
            if(ismatch(k.charAt(i),s))
            {
                
                n=mp.get(s.charAt(i));
                System.out.println("n="+n);
                time=Math.abs(m-n)+time;
                m=n;
                System.out.println(time);
            }
        }
            
         return time;
    }
    public static boolean ismatch(char c,String k)
    {
        for(int i=0;i<k.length();i++){
            if(c==k.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}
