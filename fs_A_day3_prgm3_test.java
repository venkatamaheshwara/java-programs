import java.util.*;
class venkat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        ArrayList<String>output=new ArrayList<>();
        output.addAll(getrow(input));
        for(String out:output)
        {
            System.out.print(out+" ");
        }
    }
    public static ArrayList<String> getrow(String in)
    {
       ArrayList <String> temp=new ArrayList<>();  
        String arr[]=in.split(" ");
        for(String c:arr)
            if(isshyam(c) || isgopal(c) || isramu(c))
                    temp.add(c+"");
    
        return temp;
    }
    public static boolean isshyam(String c)
    {
    
      for(char ch: c.toCharArray())
        switch(Character.toLowerCase(ch)){
            case 'q':
            case 'w':
            case 'e':
            case 'r':
            case 't':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'p': break;
            default: return false;     
        }

    return true;
    }
     public static boolean isramu(String c)   
    {
        
        
     for(char ch: c.toCharArray())
        switch(Character.toLowerCase(ch)){
            case 'z':
            case 'x':
            case 'c':
            case 'v':
            case 'b':
            case 'n':
            case 'm': break;
            default: return false;      
        }
   
    return true;
         
    }
     public static boolean isgopal(String c)  
    {
     for(char ch: c.toCharArray())
        switch(Character.toLowerCase(ch)){
            case 'a':
            case 's':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l': break;
            default: return false;      
        }
    return true;
    }
}