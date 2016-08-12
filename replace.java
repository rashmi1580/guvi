import java.util.Scanner;

public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String a=in.next();
		String b=" ";
		int l1=s.length();
		int l2=a.length();
		if(l1>l2)
		{
			System.out.println("False");
		}
		else
		for(int i=0;i<a.length();i++)
		{
		 b=s.replace(s.charAt(i),a.charAt(i));
		s=b;

		}
	if(s.equals(a))
	{
		System.out.println("true");
	}
	else
		System.out.println("false");


	}

}

