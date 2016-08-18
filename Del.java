import java.io.*;
import java.util.*;
class Del
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int d=in.nextInt();
		int l=String.valueOf(n).length();
		int k=l-d;
		int a[]=new int[l];
		for(int i=l-1;i>=0;i--)
		{
			a[i]=n%10;
			n=n/10;
		}
		Arrays.sort(a);
		for(int j=0;j<k;j++)
		{
System.out.print(a[j]);
		}
		
	}
	
}