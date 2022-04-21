// Number Rangoli 

// Swathi Prints the following Number Rongoli 
// for any given positive integer 'n'

// Help Swathi in this regard

// input=4
// output=
// 1*2*3*4*17*18*19*20
// --5*6*7*14*15*16
// ---8*9*12*13
// ----10*11


// The output should contain only - and * numbers(0-9)


// input=3
// output=
// 1*2*3*10*11*12
// --4*5*8*9
// ---6*7



import java.util.*;
public class fs_A_day19_prgm3 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0,k=1,k1=n*(n+1),n1=n;
        for(int i=1;i<=n;i++)
        {
            for(int x=1;x<i;x++)
            {
                System.out.print("-");
            }
            for(int j=1;j<=n1;j++)
            {
                System.out.print(k+"*");
                k++;
            }
            for(int z=1;z<=n1;z++)
            {
                System.out.print(k1+z-n1);
                if(z!=n1)
                {
                    System.out.print("*");
                }
            }
            k1=k1-n1;
            n1--;
            System.out.println();
            
                
        }
        
    }
}
    
