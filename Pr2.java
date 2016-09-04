import java.io.*;
import java.util.*;
class Pr2
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
	ArrayList al=new ArrayList();
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(i!=j)
			al.add(a[i]+a[j]);
			}
		}
Collections.sort(al);
System.out.println(al.get(0));
		
	}
}