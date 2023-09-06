package arraysPrograms;

import java.util.Scanner;

public class Array03 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter  the size");
		int size=sc.nextInt();
		
	   char[] ch=new char[size];
	   System.out.println("enter the array elements");
	for(int i=0; i<=ch.length-1;i++)
	   {
		   ch[i]=sc.next().charAt(0);
	   }
	System.out.println(" the array elements are");
	for(int i=0;i<=ch.length-1;i++)
	{
		System.out.println(" the output is :"+ch[i]);
	}
		
		
		
	}

}
