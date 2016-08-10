import java.util.Scanner;

public class Mult {

	public static void main(String[] args) {
		

				Scanner in=new Scanner(System.in);
				String a=in.nextLine();
                                String b=in.nextLine();
				int n1=Integer.parseInt(a);
				int n2=Integer.parseInt(b);
				int res=n1*n2;
                                String c=String.valueOf(res);
				System.out.print(c);
		}
  }