
// The FS Faculty  wants to send one of his best coding group to  a Coding competition
// There are several groups of coding students. 
// He has the marks of the students who have attended fs classes so far. 
// He wants to choose the group of students with the highest overall marks.
// The marks of the students is the sum of marks of all the students in the group. 

// However, the coding groups is not allowed to have issues. 
// A issue exists if a younger coder has a strictly higher marks than an older coder. 
// A issue does not occur between coders of the same age.

// Given two lists, marks and ages , where each marks[i] and ages[i] represents the marks and age of the
// i coder, respectively, return the highest overall marks of all possible coding groups

// The first line of input containts the marks followed by ages of the students 

// input=1 3 5 10 15
// 1 2 3 4 5
// output=34

// Explanation: You can choose all the students. 


// Input= 4 5 6 5 
// 2 1 2 1
// Output = 16

// Explanation: It is best to choose the last 3 coders. 
// Notice that you are allowed to choose multiple students of the same age.



// Input= 1 2 3 5
// 8 9 10 1
// Output= 6
// Explanation: It is best to choose the first 3 coders.

import java.util.*;
class  fs_A_day4_prgm3
{
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    String str1[]=sc.nextLine().split(" ");
    String str2[]=sc.nextLine().split(" ");
    int[] marks=new int[str1.length];
    int [] ages=new int[str2.length];
    int sum=0;
    for(int v=0;v<str1.length;v++)
    {
        marks[v]=Integer.parseInt(str1[v]);
    }
    for(int v=0;v<str2.length;v++)
    {
        ages[v]=Integer.parseInt(str2[v]);
    }
    for(int i=0;i<marks.length;i++)
    {
        for(int j=1;j>i;j--)
        {
            if(ages[i]<=ages[j])
            {
                if(marks[i]<=marks[j])
                {
                    sum+=marks[j];
                }
            }
        }
    }
    System.out.print(sum);
}
}