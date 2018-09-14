import java.util.*;
public class SearchingInArray {
    private static int i=-1;  
	private static boolean linear(int[] arr,int size,int search)
     {
    	 i++;
    	 if(size<=i)
		 {
		 return false;
		 }
    	 System.out.println("searching at "+i);
    	 if(arr[i]==search)
    	 {
    	 System.out.println("found at "+i);
    		 return true;
    	 }
    	 
 	 return linear(arr,size,search);
     }
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
        	arr[i]=scan.nextInt();
        }
        int search=scan.nextInt();
        System.out.println(linear(arr,size,search));
	}

}
