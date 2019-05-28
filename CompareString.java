import java.io.*;
import java.util.*;
class CompareString
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		int a=str1.length();
		int b=str2.length();
		if(a>=b)
		{
			System.out.println(str1);
		}
		else
		{
			System.out.println(str2);
		}
	}
}
