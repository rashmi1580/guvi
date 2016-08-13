import java.io.*;
import java.util.*;
class Arr
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		int r=in.nextInt();
		int a[]=new int[l];
		for(int i=0;i<l;i++)
		{
			 a[i]=in.nextInt();
		}
		for(int j=0;j<l;j++)
		{
			int count=0;
			if(a[j]!=r)
			{
			count++;
			}
			if(count>0)
			{
				System.out.println(a[j]);
			}
		}
	}
}