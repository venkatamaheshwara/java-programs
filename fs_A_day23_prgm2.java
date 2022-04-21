// ajith is playing a game to find a words ,if he found the word return true othere wise return false.

// for example:

// input =
// 3 3
// a b c
// d e a
// l m t
// cat
// output =true

// Note: 
// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells 
// are horizontally or vertically neighboring. The same letter cell may not be used more than once.


// example:2
// input =3 4
// a b c e
// s f c s
// a d e f
// abcced
// output =true


// input =3 4
// a b c e
// s f c s
// a d e e
// see
// output =true

// input =4 4
// a b c d
// e f g h
// i j k l
// m n o p
// abcdhlkjfm
// output =false


import java.util.*;
public class fs_A_day23_prgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        char[][] chars=new char[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                chars[i][j]=sc.next().charAt(0);
            }
        }
        String word=sc.next();
        System.out.print(is_word_found_in_chars(chars,word));
    }
    static int row,col;
    static char s_arr[][];
    public static boolean is_word_found_in_chars(char[][]temp,String sw)
    {
         row=temp.length;
         col=temp[0].length;
         s_arr=temp;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(sw.charAt(0)==temp[i][j] && is_word_found(i,j,sw.toCharArray(),0))
                    return true;
            }
        }
        return false;
    }
    public static boolean is_word_found(int R,int C,char[] s,int indx)
    {
        int x[]={1,0,-1,0};
        int y[]={0,1,0,-1};
        if(indx>=s.length)
            return true;
    if(R<0||R>=row||C<0||C>=col||s_arr[R][C]!=s[indx])
        return false;
    char pointer=s_arr[R][C];
    s_arr[R][C]='$';
    for(int i=0;i<4;i++)
    {
        if(is_word_found(R+x[i],C+y[i],s,indx+1))
            return true;
    }
    s_arr[R][C]=pointer;
        return false;
    }
}
