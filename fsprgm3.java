import java.util.*;
class Main
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	if(isgoodorbad(sc.next()))
		System.out.print("GOOD");
	else
	{
		System.out.print("BAD");
	}
}
static boolean isgoodorbad(String str)
{
	int vcount=0,ccount=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			vcount++;
		}
		else
		{
			ccount++;
		}
	}
	if((vcount>5 && str.charAt(str.length()-1)=='?')||(ccount>3 && str.charAt(str.length()-1)=='?'))
	{
		return false;
	}
	return true;
}
}