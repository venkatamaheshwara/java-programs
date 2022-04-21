// write a java program to read the number in string format and print the nth largest digit based on frequency.

// print -1 for other bounday conditions.
// print the elements in the order they occur in the string


// example:
// 123412213
// 2
// output =
// 3

// explanation:
// frequency of 1 is 3
// frequency of 2 is 3
// frequency of 3 is 2, so print 3


// input =
// 91791727198317319923381
// 3
// output =
// 2
// 8
// explanation:
// frequency of 9 is 5
// frequency of 1 is 5
// frequency of 7 is 4
// frequency of 3 is 4
// frequency of 2 is 2
// frequency of 8 is 2, so print 2 and 8( in the order they occur insertion order)


// input = 456
// 3
// output = -1

// here we dont have second frequency count so print -1

// input = 11
// 5
// output = -1



import java.util.*;
public class fs_A_day26_prgm2 {
    public static void freq(String s,int n)
    {
        Map<Integer,Integer> hm=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            int temp=Character.getNumericValue(s.charAt(i));
            hm.put(temp,hm.getOrDefault(temp,0)+1);
        }
        Set<Integer> set=new TreeSet<>(hm.values());
        List<Integer> al=new ArrayList<>(set);
        if(al.size()<n)
        System.out.print(-1);
        else
        {
        int max=al.get(al.size()-n);
        for(int i:hm.keySet())
        {
            if(max==hm.get(i))
            System.out.println(i);
        }
        }
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        int n=obj.nextInt();
        freq(s,n);
    }
}
    

