//PRINTING LARGEST ARRAY ELEMENT
package arraysPrograms;
import java.util.Scanner; 

public class LargestArray07
{
	public static void main(String[] args)
	{
		

	Scanner sc=new Scanner(System.in);
	
System.out.println(" enter the size"); // initilizing SIZE of an ARRAY
	int size=sc.nextInt();
	int[]  a= new int[size];
	
	// entering array elements or INPUT
	System.out.println(" enter the array elements");
	for(int i=0;i<=a.length-1;i++)
	{
		a[i]=sc.nextInt();
	}
	
	int largest=a[0];
	for (int i=0;i<=a.length-1;i++)
	{
		if(a[i]>largest)
		{
			largest=a[i];
		}
	}
	System.out.println("the lrgest array element is:"+largest);
 }
}