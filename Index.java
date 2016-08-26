import java.io.*;
import java.util.*;
class Index
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			if(a[j]==j)
			System.out.println(a[j]);
		}
	}
}