import java.util.*;
import java.lang.*;
class Fact
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
                long f=1;
                for(int i=1;i<=n;i++)
                {
		   f=f*i;	
		}
System.out.println(f);
	}
}