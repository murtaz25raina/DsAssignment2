import java.util.*;
public class NthFibnocci{
	private static int i=1;
	private static void fibnocci(int a,int b,int N)
	{
		i++;
		int c=0;
		c=a+b;
			
		if(i==N)
		{
			System.out.print(c+" ");
			return;
		}
			
		
		fibnocci(b,c,N);
		
	}
	public static void main(String[] x)
	{
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		fibnocci(0,1,N);
	}
}