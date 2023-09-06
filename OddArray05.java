//PRINTING ODD ARRAY ELEMENTS
package arraysPrograms;
import java.util.Scanner; 

public class OddArray05
{
	public static void main(String[] args)
	{
		

	Scanner sc=new Scanner(System.in);
	
System.out.println(" enter the size"); // initilizing SIZE of an ARRAY
	int size=sc.nextInt();
	int[]  o= new int[size];
	
	// entering array elements or INPUT
	System.out.println(" enter the array elements");
	for(int i=0;i<=o.length-1;i++)
	{
		o[i]=sc.nextInt();
	}
	System.out.println(" the ODD array elements are:-");
	// printing ODD array elements
	for(int i=0;i<=size-1;i++)
	{
		if(o[i]%2!=0) // odd if condition
		{
			System.out.println(o[i]);	
		}
		
	}
	
}

}