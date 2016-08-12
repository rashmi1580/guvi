import java.io.*;
import java.util.*;
class Revvow
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String a=sb.toString();
		StringBuffer sc=new StringBuffer(a);
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
			{
				sc.deleteCharAt(i);
				 a=sc.toString();
			}
			if(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U')
			{
				sc.deleteCharAt(i);
				 a=sc.toString();
			}
		}
System.out.print(a);
		
	}
}