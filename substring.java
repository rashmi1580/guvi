import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.next();
		StringBuffer sb=new StringBuffer();
		int i,j;
		char c[]=s.toCharArray();
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<i;j++)
			{
				if(c[i]==c[j])
				{
					break;
				}


			}
			if(i==j)
			{
				System.out.print(c[i]);
			}

		}


	}

}
