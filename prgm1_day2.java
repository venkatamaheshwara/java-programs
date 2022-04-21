import java.util.*;
public class prgm1_day2 {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String sarr[]=new String[n];
    String team1="";
    String team2="";
    for(int i=0;i<n;i++)
    {
        sarr[i]=sc.next();
        if(sarr[i]!=team1)
        {
            team1=sarr[i];
        }
        else if(sarr[i]!=team2)
        {
            team2=sarr[i];
        }
    }
    int count1=0,count2=0;
    for(int i=0;i<n;i++)
    {
        if(sarr[i]==team1)
        {
            count1++;
        }
        else
        {
            count2++;
        }
    }
    if(count2>count1)
    {
        System.out.print(team2);
    }
    else
    {
        System.out.print(team1);
    }
}

}
