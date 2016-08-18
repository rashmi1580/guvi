import java.io.*;
	import java.util.*;
	
class Coin
{
public static void main(String args[])
             {
             Scanner in=new Scanner(System.in);
	     int l=in.nextInt();
            // int m[]=new int[l];
	     int sum=in.nextInt();
	int i,j,k,count=0;
	int a[]=new int[l];
             for(i=0;i<l;i++)
                {
                  a[i]=in.nextInt();
		}
         Arrays.sort(a);
          k=l-1;
         while(k>=0)
	{
           if(sum>=a[k])
            {
                 sum=sum-a[k];
                count++;
            }
          else
           k--;
	}
System.out.println(count);
      }
	}