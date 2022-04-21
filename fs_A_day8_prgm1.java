// Door Numbering


// Shyam is building an application where he wants to write the numbers of the doors in a special way . 
// He will use the 7 different symbols (I,V,X,L,C,D,M)
// Each symbol will have the value 
// (I-1,V-5,X-10,L-50,C-100,D-500,M-1000)

// For example, 2 is written as II , just two one's added together. 
// 12 is written as XII , which is simply X + II .
// The number 27 is written as XXVII , which is XX + V + II .

// Rules followed
// The numbers  are usually written largest to smallest from left to right. 
// However, the numeral for four is not IIII . Instead, the number four is written as IV . 
// Because the one is before the five we subtract it making four. 
// The same principle applies to the number nine, which is written as IX . 

// There are six instances where subtraction is used:
// • I can be placed before V (5) and X (10) to make 4 and 9.
// • X can be placed before L (50) and C (100) to make 40 and 90.
// • C can be placed before D (500) and M (1000) to make 400 and 900.

// input=3
// output=III


// input=45
// output=XLV


// input=88
// output=LXXXVIII

// Help Shyam in building the application. 
// Assume the door Nos are between 1 to 3999 only 

import java.util.*;
class fs_A_day8_prgm1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
        System.out.print(getspecialdoornumber(n));
    }
    public static String getspecialdoornumber(int num)
    {
        HashMap<Integer, String> romanvalue = new HashMap<>();
        romanvalue.put(1, "I");
        romanvalue.put(4, "IV");
        romanvalue.put(5, "V");
        romanvalue.put(9, "IX");
        romanvalue.put(10, "X");
        romanvalue.put(40, "XL");
        romanvalue.put(50, "L");
        romanvalue.put(90, "XC");
        romanvalue.put(100, "C");
        romanvalue.put(400, "CD");
        romanvalue.put(500, "D");
        romanvalue.put(900, "CM");
        romanvalue.put(1000, "M");
        
        StringBuilder roman = new StringBuilder();
        
        int[] numbers = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        
        while (num > 0){
            for (int i = numbers.length-1; i >= 0; i--){
                if (numbers[i] < num){
                    roman.append(romanvalue.get(numbers[i]));
                    num -= numbers[i];
                    break;
                }
                else if (numbers[i] == num){
                    roman.append(romanvalue.get(numbers[i]));
                    num -= numbers[i];
                    break;
                }
                
            }
        }
        
        return roman.toString();
    }
}
