import java.util.*;
public class ReverseArray {
    private static int i=-1;
    private static int j=-1;
	private static void linear(int[] arr,int size)
     {
    	 i++;
    	 if(i==0)
    	 j=size-1;
    	 else
    	 { j--;}
    	 System.out.println(i+"  "+j);
    	 if(size/2<=i && size/2>=j )
		 {
    		 for(int k=0;k<size;k++)
    		 System.out.print(arr[k]+" ");
    		 return;
		 }
    	 int temp=0;
    	 temp=arr[i];
    	 arr[i]=arr[j];
    	 arr[j]=temp;
 	    linear(arr,size);
     }
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
        	arr[i]=scan.nextInt();
        }
        linear(arr,size);
	}

}
