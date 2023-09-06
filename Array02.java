//Double VALUES PRINTING
package arraysPrograms;
import java.util.Scanner; 

public class Array02
{
	public static void main(String[] args)
	{
		

	Scanner sc=new Scanner(System.in);
	
  System.out.println(" enter the size"); // initilizing SIZE of an ARRAY
	int size=sc.nextInt();
	double[]  d= new double[size];
	
	// entering array elements or INPUT
	System.out.println(" enter the array elements");
	for(int i=0;i<=d.length-1;i++)
	{
		d[i]=sc.nextDouble();
	}
	 
	
	// printing array elements
	for(int i=0;i<=size-1;i++)
	{
		System.out.println(d[i]);
		
	}
}
}

	
