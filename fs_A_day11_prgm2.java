// Tinku a Second Class Student is given a Phrase which contains few words in {}
// His teacher marked all dificult words in the { }. 
// His teacher gave him the meaning to the difficult words 
// he was asked to replaced the difficult words in the { } with the meanings given to him. 

// if the difficult word doesnt exist print ?

// The first line of input contains the phrase followed by difficult words 
// Each difficult words is given by a name followed by meaning (n difficult words)


// input={name}isa{gender}
// name ajay gender boy
// output=ajayisaboy


// input={name}is{age}yearsold
// name bob age two
// output=bobistwoyearsold


// input=hi{name}
// a b
// output=hi?


import java.util.*;
class fs_A_day11_prgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String phrase=sc.nextLine();
        String meaning=sc.nextLine();
        System.out.print(replace_diff_word(phrase,meaning));
    }
    static String replace_diff_word(String p,String m)
    {
        StringBuilder sb=new StringBuilder("");
        sb.append(p);
        String res=" ";
        String [] str=m.split(" ");
        //HashMap<String,String>hm=new HashMap<>();
        for(int i=0;i<str.length-1;i=i+2)
        {
            String add="{"+str[i]+"}";;
            while(sb.indexOf(add)!=-1)
                sb.replace(sb.indexOf(add),sb.indexOf(add)+str[i].length()+2,str[i+1]);

        }
        for(int i=0;i<sb.length();i++)
        {
            if(sb.indexOf("{")!=-1)
                sb.replace(sb.indexOf("{"), sb.indexOf("}")+1, "?");
        }
        res=sb.toString();
        return res;
    }
}
