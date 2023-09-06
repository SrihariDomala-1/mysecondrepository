package arraysPrograms;
import java.util.Scanner; 

public class SumOfElements
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
System.out.println(" enter the size"); // Initializing SIZE of an ARRAY
	int size=sc.nextInt();
	int[]  a= new int[size]; // syntax of array
	
	// entering array elements or INPUT
	System.out.println(" enter the array elements");
	for(int i=0;i<=a.length-1;i++)
	{
		a[i]=sc.nextInt();
	}
	
	int sum=0;
	for (int i=0;i<=a.length-1;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("the sum of array elements:"+sum);
  }
}