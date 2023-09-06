//PRINTING EVEN ARRAY ELEMENTS
package arraysPrograms;
import java.util.Scanner; 

public class EvenArray04
{
	public static void main(String[] args)
	{
		

	Scanner sc=new Scanner(System.in);
	
System.out.println(" enter the size"); // initilizing SIZE of an ARRAY
	int size=sc.nextInt();
	int[]  e= new int[size];
	
	// entering array elements or INPUT
	System.out.println(" enter the array elements");
	for(int i=0;i<=e.length-1;i++)
	{
		e[i]=sc.nextInt();
	}
	System.out.println(" the even array elements are:-");
	// printing EVEN array elements
	for(int i=0;i<=size-1;i++)
	{
		if(e[i]%2==0)
		{
			System.out.println(e[i]);	
		}
		
	}
	
}

}