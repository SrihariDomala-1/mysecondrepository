package arraysPrograms;
import java.util.Scanner;
public class ArraySingleD 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the size of an array");
	     int size=sc.nextInt(5);
	     int[]  a=new int[size];
		
		System.out.println(" enter the array elements");
		for(int i=0; i<=a.length-1;i++)
		{
			a[i]=sc.nextInt(); 
		}
		for(int i=0;i<=a.length-1;i++)
		{
		 System.out.println(a[i]);	
		}
		
	}

}
