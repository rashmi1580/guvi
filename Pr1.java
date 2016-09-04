import java.io.*;
import java.util.*;
class Pr1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		HashSet<Integer> al=new HashSet<Integer>();
		int count=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				count++;
			}
			if(count>=2)
			al.add(a[i]);
		}
System.out.println(al);
	}
}