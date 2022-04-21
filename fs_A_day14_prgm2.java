// Given a word w, return number of righteous subwords of length 4 in w.

// A word is righteous if there are no duplicate characters.

// example:
// input =wxyzzaz
// output =1

// there are 4 sub-words with size 4: wxyz,xyzz,yzza,zzaz.
// righteous subwords from the above 4 is only one wxyz with no duplicate character.


// input =abcddcbaabcd
// output =3

// there are 9 sub-words with size 4:
// abcd,bcdd,cddc,ddcb,dcba,cbaa,baab,aabc,abcd.
// righteous subwords from the above 9 are three words abcd, dcba, abcd
// with no duplicate character.
// Note:  if there are multiple occurrences of the same subword, every occurrence should be counted.


// input =abcdabcdabcd
// output =9
// abcd,bcda,cdab,dabc,abcd,bcda,cdab,dabc,abcd


import java.util.*;
public class fs_A_day14_prgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(get_count_of_righteous_words(str));
    }
    static int get_count_of_righteous_words(String s)
    {
       ArrayList<String>al=new ArrayList<>();
       int count=0;
       int end=4;
       int start=0;
        for(int i=0;i<=s.length() && end<=s.length();i++)
        {
            al.add(s.substring(start,end));
            start++;
            end++;
            
        }
        for(int i=0;i<al.size();i++)
        {
            String read=al.get(i);
            if(is_continuous(read))
            {
                count++;
            }
        }
        return count;
    }
    static boolean is_continuous(String r)
    {
        HashMap<Character, Integer> c = new HashMap<>();

        for (int i = 0; i < r.length(); i++) {
            if (!c.containsKey(r.charAt(i)))
                c.put(r.charAt(i), 1);
            else
                return false;
        }
        return true;
    }
}