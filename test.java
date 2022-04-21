import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(completenumber(n))
        {
            System.out.print("COMPLETE NUMBER");
        }
        else
        {
            System.out.print("NOT COMPLETE NUMBER"); 
        }
        
    }
    public static boolean completenumber(int n)
    { 
        int rem=0;
        int res=0,flag=0;
        while(n>=0)
        {
            rem=n%10;
            res=rem;
            if(res%2==0)
                {
                    
                    flag=1;
                }
            else{
                flag=-1;
                break;
            }
            n=n/10;
        }
        // if(res%2==0)
        //     System.out.println("COMPLETE NUMBER");
        if(flag==1)
        {
            return  true;
        }
        else
        {
            return false;
        }
    }
   
}