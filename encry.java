import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String message=sc.nextLine();
        int key=sc.nextInt();
        System.out.print(CustomCaesarCipher(message,key));
    }
    public static String CustomCaesarCipher(String message,int key)
    {
        String encryp="";
        for(int i=0;i<message.length();i++)
        {
            char ch = message.charAt(i);
            if(ch !=' ')
            {
                if(ch>='a' && ch<='z')
                {
                   ch = (char)(((ch-97+key)%26)+97);
                }
                else if(ch>='A' && ch<='Z')
                {
                    ch=(char)(((ch-65+key)%26)+65);
                }
                else if(ch>='0' && ch<='9')
                {
                    ch=(char)(((ch-48+key)%26)+48);
                }
        
            }
               encryp += ch+"";
        }
        return encryp;
    }
}