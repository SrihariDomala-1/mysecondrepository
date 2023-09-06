//PRINTING SMALLEST ARRAY ELEMENT
package arraysPrograms;
import java.util.Scanner; 

public class SmallestArray08
{
	public static void main(String[] args)
	{
		

	Scanner sc=new Scanner(System.in);
	
System.out.println(" enter the size"); // initilizing SIZE of an ARRAY
	int size=sc.nextInt();
	int[]  a= new int[size]; // syntax of array
	
	// entering array elements or INPUT
	System.out.println(" enter the array elements");
	for(int i=0;i<=a.length-1;i++)
	{
		a[i]=sc.nextInt();
	}
	
	int smallest=a[0];
	for (int i=0;i<=a.length-1;i++)
	{
		if(a[i]<smallest)
		{
			smallest=a[i];
		}
	}
	System.out.println("the lrgest array element is:"+smallest);
}
}