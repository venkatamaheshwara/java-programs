import java.util.*;
public class prgm2_day2 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String song=sc.next();
        String casesong=song.toUpperCase();
        System.out.print(getoriginalsong(casesong));
    }
    public static String getoriginalsong(String s)
    {
        boolean check=s.contains("WUB")?true:false;
        String originalsong="";
        if(check)
        {
               originalsong=originalsong+s.replace("WUB"," "); 
               originalsong=originalsong.trim();
        }
        else{
            originalsong=originalsong+" ";
        }
        return originalsong;
    }
}
