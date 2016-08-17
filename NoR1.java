import java.util.Scanner;

public class NoR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.next();
		StringBuffer sb=new StringBuffer();
		int i,j;
		char c[]=s.toCharArray();
		for(i=0;i<c.length;i++)
		{
			for(j=c.length-1;j>=0;j--)
			{
				if(c[i]==c[j])
				{
					break;
				}


			}
			if(i==j)
			{
				sb.append(c[i]);
				sb.reverse();
			}

		}
System.out.println(sb);

	}

}
