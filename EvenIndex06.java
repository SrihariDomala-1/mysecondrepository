//PRINTING EVEN INDEX ARRAY ELEMENTS
package arraysPrograms;
import java.util.Scanner; 

public class EvenIndex06
{
	public static void main(String[] args)
	{
		

	Scanner sc=new Scanner(System.in);
	
System.out.println(" enter the size"); // initilizing SIZE of an ARRAY
	int size=sc.nextInt();
	int[]  I= new int[size];
	
	// entering array elements or INPUT
	System.out.println(" enter the array elements");
	for(int i=0;i<=I.length-1;i++)
	{
		I[i]=sc.nextInt();
	}
	System.out.println(" the EVEN INDEX  elements of array are:-");
	// printing EVEN INDEX array elements
	for(int i=0;i<=size-1;i++)
	{
		if(i%2==0) // odd if condition
		{
			System.out.println(I[i]);	
		}
		
	}
	
}

}