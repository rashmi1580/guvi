import java.util.Scanner;

public class Camel {

	public static void main(String[] args) {
		

				Scanner in=new Scanner(System.in);
				String s=in.nextLine();
				String s1[]=s.split(" ");

				StringBuffer sc=new StringBuffer();
				for(int i=0;i<s1.length;i++)
				{
					StringBuffer sb=new StringBuffer(s1[i]);
					char c[]=s1[i].toCharArray();
					String a=String.valueOf(c[0]);
					String u=a.toUpperCase();
				    sb.deleteCharAt(0);
				    sc.append(u);
				    sc.append(sb);

				   sb.delete(0,sb.length());


				}
System.out.println(sc);
		}
	}


