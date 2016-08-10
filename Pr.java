import java.io.*;
import java.util.*;
class Pr
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,count=0;
		int x=in.nextInt();
		int y=in.nextInt();
		for( i=x;i<=y;i++)
		{
			for( j=2;j<=i;j++)
			{
				if(i%j==0)
				break;
			}
				if(i==j)
				count++;
		}
 			System.out.print(count);
	}
}