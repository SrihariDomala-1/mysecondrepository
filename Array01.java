//INTEGER VALUES PRINTING
package arraysPrograms;
import java.util.Scanner;

public class Array01
{
	public static void main(String[] args)
	{
		

	Scanner sc=new Scanner(System.in);
	
	System.out.println(" enter the size"); // initilizing SIZE of an ARRAY
	int size=sc.nextInt();
	int[]  n= new int[size];
	
	// entering array elements or INPUT
	System.out.println(" enter the array elements");
	for(int i=0;i<=n.length-1;i++)
	{
		n[i]=sc.nextInt();
	}
	 
	
	// printing array elements
	for(int i=0;i<=size-1;i++)
	{
		System.out.println(n[i]);
		
	}
	
}

}