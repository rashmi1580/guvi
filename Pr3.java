import java.io.*;
import java.util.*;
class Pr3
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int j,count=0;
		StringBuffer sb=new StringBuffer();
		ArrayList<Character> al=new ArrayList<Character>();
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(j=0;j<s.length();j++)
			{
				if(c[i]==c[j])
				break;
			}
				if(i==j)
				al.add(c[i]);
		}
		for(int i=0;i<al.size();i++)
		{
			count=0;
			for(j=0;j<s.length();j++)
			{
				if(al.get(i)==c[j])
				count++;
			}
		sb.append(al.get(i));
		sb.append(count);
		}
System.out.println(sb);
	}
}