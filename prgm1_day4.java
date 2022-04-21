/*
Given a string of parentheses, write a function to compute the minimum number of 
parentheses to be removed to make the string valid (i.e. each open parenthesis is 
eventually closed).

For example, given the string "()())()", you should return 1. Given the string ")(", 
you should return 2, since we must remove all of them.


*/
import java.util.*;
class Test
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(get_min_parenthesis(sc.next()));
    }
    public static int get_min_parenthesis(String str)
    {
        int count=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(0)==')')
            {
                count++;
                if(str.charAt(i+1)=='(')
                {
                    count++;
                    break;
                }
                
            }
            else{
                        if(str.charAt(i)=='(' && str.charAt(i+1)=='(')
                        {
                            count++;
                            
                        
                        }
                        else if(str.charAt(i)==')' && str.charAt(i+1)==')')
                        {
                            count++;
                            
                        }
                }
        }
        return count;
    }
}