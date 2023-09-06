package arraysPrograms;

import java.util.Scanner;

public class SortingOfanARRAY
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	
	int[] a=new int[size];

	System.out.println(" enter th array elemnts");
	for(int i=0;i<=a.length-1;i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int cycle=1;cycle<=a.length-1;cycle++)
	{
		for(int i=0;i<=a.length-2;i++)
		{
			if(a[i]>a[i+1])
			{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			}
			
		}
	}
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
}

}
