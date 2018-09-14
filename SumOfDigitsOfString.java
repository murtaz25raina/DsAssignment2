import java.util.*;
public class SumOfDigitsOfString
{
	private static int i=-1;
	private static int sum(String s1)
	{
		i++;
		char arr[]=s1.toCharArray();
		
		if(i==s1.length()-1)
		{
			return ((int)arr[i]-48);
		}
		
	  return ((int)arr[i]-48)+sum(s1);
		
	}
	public static void main(String[] x)
	{
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		System.out.println(sum(s1));
	}
}