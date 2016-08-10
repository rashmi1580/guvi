import java.util.*;
import java.lang.*;
class Revstr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char a[]=s.toCharArray();
		String s1=new String();
		for(int i=a.length-1;i>=0;i--)
		{
			s1+=a[i];
		
		}
		System.out.println(s1);

	}


}