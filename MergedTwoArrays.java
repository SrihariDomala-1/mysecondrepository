package arraysPrograms;
import java.util.Scanner;
public class MergedTwoArrays 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		int[] a=new int[size];

		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println(" enter  B the array elements");
		int[] b=new int[a.length];
		
		for(int i=0;i<=b.length-1;i++)
		{
			b[i]=sc.nextInt();
		}
	    
		int[] c=new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++)
		{
			c[i]=a[i];
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			c[i+a.length]=b[i];
		}
		
		
		System.out.println(" the c elements");
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.println(c[i]);
		}
		
		
	}
}