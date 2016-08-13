import java.util.Scanner;

public class Revv {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a,b,r=0,sum=0;
		while(n!=0)
		{
			a=n%10;
			sum+=a;
			n=n/10;
		}
		
			while(sum>0)
			{
			b=sum%10;
			r=(r*10)+b;
			sum=sum/10;
			}
if(sum==r)
System.out.println("Palindrome");
else
System.out.println("Not palindrome");
}}
		