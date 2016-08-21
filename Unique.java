import java.io.*;
import java.util.*;
class Unique
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			al.add(in.nextInt());
		}
		for(int i=0;i<n;i++)
		{	
			count=0;
			for(int j=0;j<n;j++)
			{
				if(al.get(i)==al.get(j))
				count++;
			}
			if(count==1)
			{
				System.out.println(al.get(i));
			}
		}
		
	}
}