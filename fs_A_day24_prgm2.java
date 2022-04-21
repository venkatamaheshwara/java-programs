// Sunder is given a number(num).
// He will apply the following rules only 2 times 
// 1432. Max Difference You Can Get From Changing an Integer
// Pick a digit x (9 >= x >=0) .
// Pick another digit y (9 >= y >= 0) . The digit y can be equal to x .
// Replace all the occurrences of x in the decimal representation of num by y .
// The new integer cannot have any leading zeros, also the new integer cannot be 0.
// Let a and b be the results of applying the operations to num the first and second times, respectively.
// Return the max difference between a and b .

// Example 1:
// Input = 555
// Output = 888

// Explanation: The first time pick x = 5 and y = 9 and store the new integer in a.
// The second time pick x = 5 and y = 1 and store the new integer in b.
// We have now a = 999 and b = 111 and max difference = 888


// Example 2:
// Input: num = 9
// Output: 8
// Explanation: The first time pick x = 9 and y = 9 and store the new integer in a.
// The second time pick x = 9 and y = 1 and store the new integer in b.
// We have now a = 9 and b = 1 and max difference = 8

// Input = 123456
// Output = 820000

// Explanation:
// The first time pick x=1 and y=9 and store the new integer in a(a=923456)
// The second time pick x=2 and y=0 and store the new integer in b (b=103456)
// Now a-b becomes 820000


// Input = 10000
// Output = 80000
// Explanation:
// The first time pick x=1 and y=9 and store the new integer in a(a=90000)
// The second time pick x=9 and y=1 and store the new integer in b (b=10000)
// Now a-b becomes 80000


import java.util.*;
public class fs_A_day24_prgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(new fs_A_day24_prgm2().get_Max_Difference(n));
    }
    public int get_Max_Difference(int num)
    {
       String a = Integer.toString(num);
        String b = Integer.toString(num);
        char x = '9';
        int n = a.length();
        for (int i = 0; i< n; i++) {
            if (a.charAt(i) < x) {
                x = a.charAt(i);
                break;
            }
        }
        // we take y=9
        int num1 = Integer.parseInt(a.replace(x, '9'));
        System.out.println(num1);
        if (b.charAt(0) != '1') {
            // we take first digit as x and y=1
            int num2 = Integer.parseInt(b.replace(b.charAt(0), '1'));
            return num1-num2;
        }
        x = '0';
        for (int i = 1; i< n; i++) {
            if (b.charAt(i) > x && b.charAt(i)!=b.charAt(0)){
                x = b.charAt(i);
                break;
            }
        }
        // we take y=0
        int num2 = Integer.parseInt(b.replace(x, '0'));
        return num1-num2;
    }
    
}
