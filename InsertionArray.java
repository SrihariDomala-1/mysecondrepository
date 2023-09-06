package arraysPrograms;
import java.util.*;
public class InsertionArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=5;
		System.out.println(" enter  A the array elements");
		int[] a=new int[size];
		
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println(" enter  B the array elements");
		int[] b=new int[a.length-1];
		
		for(int i=0;i<=b.length-1;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
