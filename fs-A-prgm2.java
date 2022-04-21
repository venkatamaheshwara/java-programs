// A Group of Monsters has few powers. 
// The powers are represented in numbers both positive and negative. 
// Each Member of the monster prays to get some power. 
// God sanctions only one member of the Monster Group. 
// The power can be performed only once on only one member of the monster. 
// God will multipy the monster power with the same power. 
// After  performing the above action, a sub-group of monsters check the power they have.
// We have to now see which sub-group has the highest power. Print the Highest Sub-Power.


// The first line of input contains the powers of the monsters. 

// input = 4 -1 -5 -3
// output = 28

// The power operation is performed on the third monster, -5 * -5 which is 25 

// Now the sub group with highest power is 4+(-1)+25 = 28 
import java.util.*;
class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        int n=str.length;
        int arr[]=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            int a=Integer.valueOf(str[i]);
            arr[i]=a;

        }
        System.out.print(gethighighestsubgrouppower(arr,n));
    }
    public static int gethighighestsubgrouppower(int sarr[],int n)
    {
        int res=0,max=0,sum=0,maxind=0;
        int sqr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            sqr[i]=sarr[i]*sarr[i];
            if(max<sqr[i])
            {
                max=sqr[i];
                maxind=i;
            }
        }
        sarr[maxind]=max;
       
        for(int i=sarr.length-1;i>=0;i--)
        {
            sum+=sarr[i];
             if(sum>res)
                    res=sum;
             if(sarr[i]>res)
                    res=sarr[i];

        }
        return res;
    }
}
