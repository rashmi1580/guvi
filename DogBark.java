import java.io.*;
import java.util.*;
class DogBark
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		HashMap<String,String> m=new HashMap<String,String>();
		m.put("DogBarks Once","Smile");
		m.put("DogBarks Twice","Cry");
		m.put("DogBarks Thrice","Fear");
		System.out.println("Alex "+m.get("DogBarks Once")+"and "+m.get("DogBarks Twice"));
	}
}