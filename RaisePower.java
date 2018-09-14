import java.util.*;
public class RaisePower{
	private static int i=-1;
	private static int powerF(int a,int b)
	{
	  if(i==-1)
	  {
		  i=b;
	  }
		if(i==1)
		{
			return a;
		}
		i--;
			
		return a*powerF(a,b);
		
	}
	public static void main(String[] x)
	{
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int Y=scan.nextInt();
		System.out.println(powerF(N,Y));
	}
}