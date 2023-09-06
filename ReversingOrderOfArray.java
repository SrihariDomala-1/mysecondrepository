//REVERSING ORDER OF THE GIVEN ELEMENTS OF AN ARRAY
package arraysPrograms;
import java.util.Scanner;
public class ReversingOrderOfArray
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
	 
	System.out.println(" reversing array:-");
	// printing array elements
	for(int i=n.length-1;i>=0;i--)
	{
		System.out.println(n[i]);
		
	}
	
}

}